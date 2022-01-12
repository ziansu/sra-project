@java.lang.Override
public boolean allowsCFMLAssignment(java.lang.String tagName) {
    boolean assignment = tagName.toLowerCase().equals("cfset");
    return assignment;
}