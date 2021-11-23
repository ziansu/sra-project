@org.springframework.web.bind.annotation.RequestMapping(value = "/modifyCourse")
@org.springframework.web.bind.annotation.ResponseBody
public com.takeaway.model.response.CommonResponse modifyCourse(com.takeaway.model.course.Course course, org.springframework.web.multipart.MultipartFile[] img) throws java.io.IOException {
    com.takeaway.model.course.Course oldCourse = courseRepo.findOne(course.getId());
    course.setVolume(oldCourse.getVolume());
    if ("".equals(course.getImg()))
        course.setImg(null);
    
    courseRepo.save(course);
    return new com.takeaway.model.response.CommonResponse("0", "菜品信息修改成功");
}