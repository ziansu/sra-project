@org.springframework.web.bind.annotation.RequestMapping(value = "/listmessage", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.Object listmessage() {
    if ((httpSession.getAttribute("user")) == null)
        return new cn.edu.upc.yb.integrate.common.dto.ErrorReporter((-1), "没有登陆");
    
    cn.edu.upc.yb.integrate.common.dto.YibanBasicUserInfo user = ((cn.edu.upc.yb.integrate.common.dto.YibanBasicUserInfo) (httpSession.getAttribute("user")));
    int teacherYBId = user.visit_user.userid;
    cn.edu.upc.yb.integrate.speaktoteacher.model.Teacher teacher = teacherRepository.findFirstByYibanId(teacherYBId);
    return messageRepository.findByTeacherId(teacher.getId());
}