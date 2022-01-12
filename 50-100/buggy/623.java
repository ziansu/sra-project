public void validate(com.thoughtworks.go.config.ValidationContext validationContext) {
    if (org.apache.commons.lang.StringUtils.isEmpty(link)) {
        configErrors.add(com.thoughtworks.go.config.TrackingTool.LINK, "Link should be populated");
    }else
        if (org.apache.commons.lang.StringUtils.isEmpty(regex)) {
            configErrors.add(com.thoughtworks.go.config.TrackingTool.REGEX, "Regex should be populated");
        }
    
    if (!(link.contains("${ID}"))) {
        configErrors.add(com.thoughtworks.go.config.TrackingTool.LINK, "Link must be a URL containing '${ID}'. Go will replace the string '${ID}' with the first matched group from the regex at run-time.");
    }
}