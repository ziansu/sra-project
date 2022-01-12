public static boolean onCreateOptionsMenu(java.lang.String instanceId, android.view.Menu menu) {
    java.util.Map<java.lang.String, com.taobao.weex.common.WXModule> modules = com.taobao.weex.bridge.WXModuleManager.sInstanceModuleMap.get(instanceId);
    if (modules != null) {
        for (java.lang.String key : modules.keySet()) {
            com.taobao.weex.common.WXModule module = modules.get(key);
            if (module != null) {
                module.onCreateOptionsMenu(menu);
            }else {
                com.taobao.weex.utils.WXLogUtils.w((("onActivityResult can not find the " + key) + " module"));
            }
        }
    }
    return false;
}