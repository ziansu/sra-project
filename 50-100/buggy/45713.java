private java.lang.Class createClass1() {
    if ((thisClass) == null) {
        java.lang.ClassLoader cl = getClassLoader();
        synchronized(javassist.util.proxy.ProxyFactory.proxyCache) {
            if (factoryUseCache)
                createClass2(cl);
            else
                createClass3(cl);
            
        }
    }
    java.lang.Class result = thisClass;
    thisClass = null;
    return result;
}