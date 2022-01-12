public static java.lang.String getTagDescription(java.lang.String tagName) {
    if (TagVS.WILDTAG.equals(tagName))
        return org.votingsystem.util.ContextVS.getMessage("wildTagLbl").toLowerCase();
    else
        return tagName.toLowerCase();
    
}