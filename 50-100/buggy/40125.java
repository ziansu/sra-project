protected final java.util.List<java.lang.String> getNames() {
    if (this._multipart) {
        getFiles();
        return new java.util.ArrayList<java.lang.String>(uploads.keySet());
    }else {
        java.util.Enumeration<?> e = req.getParameterNames();
        java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
        while (e.hasMoreElements()) {
            list.add(e.nextElement().toString());
        } 
        return list;
    }
}