@org.springframework.web.bind.annotation.RequestMapping(value = "/tools", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<org.sagebionetworks.ga4gh.model.Tool> listTools(@org.springframework.web.bind.annotation.PathVariable(value = "registry-id", required = true)
java.lang.String toolId) {
    java.util.List<org.sagebionetworks.ga4gh.model.Tool> tools = new java.util.ArrayList<org.sagebionetworks.ga4gh.model.Tool>();
    return tools;
}