public java.util.Map<java.lang.String, hudson.remoting.RemoteClassLoader.ClassFile2> fetch3(java.lang.String className) throws java.lang.ClassNotFoundException {
    hudson.remoting.RemoteClassLoader.ClassFile cf = fetch2(className);
    return java.util.Collections.singletonMap(className, new hudson.remoting.RemoteClassLoader.ClassFile2(cf.classLoader, new hudson.remoting.ResourceImageDirect(cf.classImage), null, null, null));
}