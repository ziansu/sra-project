protected java.lang.Object zip(java.lang.String obj) {
    if (obj == null)
        return xnull(byte[].class);
    
    net.java.osgi.embeddy.springer.support.BytesStream os = new net.java.osgi.embeddy.springer.support.BytesStream().setNotCloseNext(true);
    try (java.util.zip.GZIPOutputStream gz = new java.util.zip.GZIPOutputStream(os)) {
        if (obj != null)
            gz.write(obj.getBytes("UTF-8"));
        
    } catch (java.lang.Throwable e) {
        os.closeAlways();
        throw net.java.osgi.embeddy.springer.EX.wrap(e);
    }
    return os;
}