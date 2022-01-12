public hudson.remoting.RemoteClassLoader.ResourceFile[] getResources2(java.lang.String name) throws java.io.IOException {
    byte[][] r = base.getResources(name);
    if (r == null)
        return null;
    
    hudson.remoting.RemoteClassLoader.ResourceFile[] res = new hudson.remoting.RemoteClassLoader.ResourceFile[r.length];
    for (int i = 0; i < (res.length); i++) {
        res[i] = new hudson.remoting.RemoteClassLoader.ResourceFile(new hudson.remoting.ResourceImageDirect(r[i]), null);
    }
    return res;
}