public static java.lang.String makeStackValue(java.lang.String value, boolean isRemoveLine) {
    int sIndex = scouter.client.stack.utils.StringUtils.getStartIindex(value);
    if (sIndex < 0) {
        throw new java.lang.RuntimeException((value + " is not stack!"));
    }
    int eIndex = 0;
    if (isRemoveLine) {
        eIndex = value.indexOf('(');
    }
    if (eIndex > 0) {
        return value.substring((sIndex + 3), eIndex);
    }else {
        return value.substring((sIndex + 3));
    }
}