public void closeStreamAndWriter() throws java.io.IOException {
    if ((writer) != null) {
        if (!(servletOutputStream.isClosed())) {
            writer.flush();
        }
        writer.close();
    }else {
        if ((servletOutputStream) == null) {
            createOutputStream();
        }
        servletOutputStream.close();
    }
}