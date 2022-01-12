private java.lang.Class createClass1() {
    java.lang.Class result = thisClass;
    if (result == null) {
        java.lang.ClassLoader cl = getClassLoader();
        synchronized(javassist.util.proxy.ProxyFactory.proxyCache) {
            if (factoryUseCache)
                createClass2(cl);
            else
                createClass3(cl);
            
            result = thisClass;
            thisClass = null;
        }
    }
    return result;
}