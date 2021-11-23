public static void onActivityStart(java.lang.String instanceId) {
    java.util.HashMap<java.lang.String, com.taobao.weex.common.WXModule> modules = com.taobao.weex.bridge.WXModuleManager.sInstanceModuleMap.get(instanceId);
    if (modules != null) {
        for (java.lang.String key : modules.keySet()) {
            com.taobao.weex.common.WXModule module = modules.get(key);
            if (module != null) {
                module.onActivityStart();
            }else {
                com.taobao.weex.utils.WXLogUtils.w((("onActivityStart can not find the " + key) + " module"));
            }
        }
    }
}