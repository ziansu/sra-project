public java.lang.Object invoke(java.lang.Object proxy, java.lang.reflect.Method method, java.lang.Object[] args) {
    com.runrev.android.LCBInvocationHandler.doNativeListenerCallback(m_handler_ptr, method.getName(), args);
    return proxy;
}