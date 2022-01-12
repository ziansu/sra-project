@org.ednovo.gooru.core.security.AuthorizeOperations(operations = { org.ednovo.gooru.core.constant.GooruOperationConstants.OPERATION_FOLDER_READ })
@org.springframework.web.bind.annotation.RequestMapping(value = { "" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView getFolderList(javax.servlet.http.HttpServletRequest request, @org.springframework.web.bind.annotation.RequestParam(value = OFFSET_FIELD, required = false, defaultValue = "0")
java.lang.Integer offset, @org.springframework.web.bind.annotation.RequestParam(value = LIMIT_FIELD, required = false, defaultValue = "20")
java.lang.Integer limit, @org.springframework.web.bind.annotation.RequestParam(value = ID, required = false)
java.lang.String gooruOid, @org.springframework.web.bind.annotation.RequestParam(value = TITLE, required = false)
java.lang.String title, @org.springframework.web.bind.annotation.RequestParam(value = USER_NAME, required = false)
java.lang.String username, javax.servlet.http.HttpServletResponse resHttpServletResponse) {
    return toJsonModelAndView(this.getCollectionService().getFolderList(limit, offset, gooruOid, title, username), true);
}