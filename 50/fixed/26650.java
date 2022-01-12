@org.springframework.web.bind.annotation.RequestMapping(value = "/updateUser")
@org.springframework.web.bind.annotation.ResponseBody
com.barban.utilities.JTableJsonResponse updateUser(com.barban.model.User user) {
    com.barban.controllers.AdminController.LOG.info(java.lang.String.format("Update user: (%s)", user));
    com.barban.utilities.JTableJsonResponse response = new com.barban.utilities.JTableJsonResponse();
    response.setResult("OK");
    response.setRecord(user);
    return response;
}