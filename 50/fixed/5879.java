public static void copyAttributesFromTo(edu.illinois.cs.cogcomp.core.datastructures.HasAttributes origObj, edu.illinois.cs.cogcomp.core.datastructures.HasAttributes newObj) {
    for (java.lang.String key : origObj.getAttributeKeys())
        newObj.addAttribute(key, origObj.getAttribute(key));
    
}