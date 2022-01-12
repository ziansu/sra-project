@org.springframework.web.bind.annotation.RequestMapping(value = "/page")
@org.springframework.web.bind.annotation.ResponseBody
public com.topie.campus.common.utils.Result page(java.lang.Integer pageNum, java.lang.Integer pageSize) {
    java.lang.Integer userId = com.topie.campus.security.utils.SecurityUtil.getCurrentUserId();
    com.topie.campus.common.SimplePageInfo<com.topie.campus.core.model.Student> students = studentService.findByLeadRole(pageNum, pageSize, userId);
    return com.topie.campus.common.utils.ResponseUtil.success(com.topie.campus.common.utils.PageConvertUtil.grid(students));
}