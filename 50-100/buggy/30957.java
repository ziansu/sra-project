public static java.lang.String getBasePathFromFileOrResource(java.lang.String Name) throws java.lang.Exception {
    int i1 = Name.lastIndexOf('/');
    int i2 = Name.lastIndexOf('\\');
    if ((i1 == (-1)) && (i2 == (-1)))
        throw new java.lang.Exception((("Cannot find a path in '" + Name) + "\'. Looked for \'/\' and \'\\\'."));
    
    return Name.substring(0, java.lang.Math.max(i1, i2));
}