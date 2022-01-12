@by.itechart.flowerty.web.controller.ResponseBody
@by.itechart.flowerty.web.controller.RequestMapping(value = "user/list/{page}")
public org.springframework.data.domain.Page<by.itechart.flowerty.model.User> getPage(@by.itechart.flowerty.web.controller.PathVariable(value = "page")
java.lang.Integer page) throws java.lang.Exception {
    by.itechart.flowerty.web.controller.UserController.LOGGER.info("get page with number {}", page);
    page = ((page == null) || (page < 1)) ? 0 : --page;
    org.springframework.data.domain.Page<by.itechart.flowerty.model.User> pageUsers = userService.getPage(page, 1);
    by.itechart.flowerty.web.controller.UserController.LOGGER.info("fetch {} users", pageUsers.getTotalElements());
    return pageUsers;
}