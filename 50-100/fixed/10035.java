@java.lang.Override
public boolean usesAttributes(java.lang.String tagName) {
    tagName = tagName.toLowerCase();
    boolean usesAttributes = !(((tagName.equals("cfset")) || (tagName.equals("cfif"))) || (tagName.equals("cfelseif")));
    return usesAttributes;
}