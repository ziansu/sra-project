private static java.lang.String toLowerCaseFirstOne(java.lang.String s) {
    if (java.lang.Character.isLowerCase(s.charAt(0)))
        return s;
    else
        return new java.lang.StringBuilder().append(java.lang.Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
    
}