public static java.lang.Object getMember(java.lang.Object target, java.lang.String member) {
    if (target == null) {
        return null;
    }
    return com.angcyo.uiview.utils.Reflect.getMember(target.getClass(), target, member);
}