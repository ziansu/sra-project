@java.lang.Override
public boolean allowsCFMLAssignment(java.lang.String tagName) {
    boolean assignment = tagName.toLowerCase().equals("cfset");
    java.lang.System.out.println(((("allowsCFMLAssignment: " + tagName) + ":") + assignment));
    return assignment;
}