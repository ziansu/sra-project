@org.soippo.controller.RequestMapping(value = "/userlist", method = RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView userListPage(org.springframework.web.servlet.ModelAndView model) throws com.fasterxml.jackson.core.JsonProcessingException {
    model.addObject("grouplist", objectMapper.writeValueAsString(groupService.findAll()));
    model.addObject("rolesList", objectMapper.writeValueAsString(org.soippo.utils.UserRoles.values()));
    model.setViewName("userlist");
    model.addObject("moduleList", moduleList());
    return model;
}