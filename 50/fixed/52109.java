protected void afterHookedMethod(mobi.acpm.inspeckage.hooks.MethodHookParam param) throws java.lang.Throwable {
    if ((mobi.acpm.inspeckage.hooks.CryptoHook.sb) == null) {
        mobi.acpm.inspeckage.hooks.CryptoHook.sb = new java.lang.StringBuffer();
    }
    mobi.acpm.inspeckage.hooks.CryptoHook.sb.append((" IV:" + ((java.lang.String) (param.getResult()))));
}