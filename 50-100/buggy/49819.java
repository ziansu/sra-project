private <T> void check(T t, java.util.function.BiConsumer<T, org.intellimate.izou.addon.AddOnModel> specific) {
    if (!(shouldCheck())) {
        return ;
    }
    try {
        org.intellimate.izou.addon.AddOnModel addOn = secureAccess.doEvelevated(this::getOrThrowAddOnModelForClassLoader);
        secureAccess.doElevated(() -> specific.accept(t, addOn));
    } catch (java.lang.Exception e) {
    }
}