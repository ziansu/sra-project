@org.springframework.web.bind.annotation.ModelAttribute(value = "workLocations")
public java.util.List<java.lang.String> populateworkLocationTypes() {
    com.psk.pms.controller.ProjectController.LOGGER.info("method = populateworkLocationTypes()");
    return projectService.getDropDownValuesFor(com.psk.pms.Constants.WORKLOCATION);
}