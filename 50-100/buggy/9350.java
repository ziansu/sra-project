@java.lang.Override
public void export(java.io.OutputStream os) {
    java.io.Writer writer = null;
    try {
        writer = new java.io.OutputStreamWriter(os, "UTF8");
        export(writer);
    } catch (java.lang.Exception e) {
        log.error(("Failed to write summary csv data: " + (this)), e);
    } finally {
        try {
            writer.close();
        } catch (java.lang.Throwable e) {
        }
    }
}