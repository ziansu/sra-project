public static org.kiteq.binding.manager.BindingManager getInstance(java.lang.String zkAddr) {
    org.kiteq.binding.manager.BindingManager bindingManager = org.kiteq.binding.manager.BindingManager.instances.get(zkAddr);
    if (bindingManager == null) {
        synchronized(zkAddr.intern()) {
            if (bindingManager == null) {
                bindingManager = new org.kiteq.binding.manager.BindingManager(zkAddr);
                org.kiteq.binding.manager.BindingManager.instances.put(zkAddr, bindingManager);
            }
        }
    }
    return bindingManager;
}