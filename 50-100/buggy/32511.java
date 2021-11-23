public java.lang.String switchWeb() {
    java.lang.String name = null;
    java.util.Set<java.lang.String> set = superdr.getContextHandles();
    for (java.lang.String s : set) {
        if (!("NATIVE_APP".equals(s))) {
            superdr.context(s);
            name = superdr.getContext();
            break;
        }
    }
    return name;
}