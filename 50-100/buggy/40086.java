public synchronized void removeListener(com.raynigon.lib.events.handling.EventListener inEventListener) {
    if (inEventListener == null)
        throw new java.lang.NullPointerException("The EventListener mustn't be null");
    
    com.raynigon.lib.events.handling.EventMethod[] ems = method_map.get(inEventListener);
    java.util.List<com.raynigon.lib.events.handling.EventMethod> methods;
    for (com.raynigon.lib.events.handling.EventMethod em : ems) {
        method_list.remove(em);
        for (java.lang.Object key : cached_methods.keySet()) {
            methods = cached_methods.get(key);
            methods.remove(em);
        }
    }
}