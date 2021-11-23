@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "/decs", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getDescriptionProposition(@org.springframework.web.bind.annotation.RequestParam(value = "descTag")
java.lang.String descTag) {
    java.util.Map<java.lang.String, java.util.List<java.lang.String>> suggestions = new java.util.HashMap<java.lang.String, java.util.List<java.lang.String>>();
    suggestions.put("query", java.util.Arrays.asList("unit"));
    suggestions.put("suggestions", resourceService.getDescriptionBySearchTag(descTag));
    return suggestions;
}