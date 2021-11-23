public static java.util.HashSet<java.lang.String> getHookingClassSet(java.lang.String arg) {
    java.lang.String[] c = scouter.util.StringUtil.tokenizer(arg, ",");
    java.util.HashSet<java.lang.String> classSet = new java.util.HashSet<java.lang.String>();
    for (int i = 0; i < (c.length); i++) {
        classSet.add(c[i]);
    }
    return classSet;
}