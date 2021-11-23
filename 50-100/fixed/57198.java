@org.springframework.web.bind.annotation.RequestMapping(value = "/projects/{pid}/groups/{gid}", method = org.springframework.web.bind.annotation.RequestMethod.DELETE, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public java.lang.String deleteGroup(javax.servlet.http.HttpServletRequest request, @org.springframework.web.bind.annotation.PathVariable
java.lang.Integer pid, @org.springframework.web.bind.annotation.PathVariable
java.lang.Integer gid) {
    cn.junety.alarm.web.controller.User currentUser = getUser(request);
    logger.info("DELETE /projects/{}/groups/{}, current_user:{}", pid, gid, currentUser);
    groupService.deleteGroup(gid);
    return cn.junety.alarm.web.common.ResponseHelper.buildResponse(2000);
}