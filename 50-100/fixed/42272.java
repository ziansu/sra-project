public final void print(java.lang.Object o) {
    try {
        java.io.BufferedWriter writer = new java.io.BufferedWriter(resp.getWriter());
        writer.write(o.toString());
        writer.flush();
    } catch (java.lang.Exception e) {
        if (org.giiwa.framework.web.Model.log.isErrorEnabled())
            org.giiwa.framework.web.Model.log.error(o, e);
        
    }
}