public void send(java.lang.String path) {
    if (path.startsWith("/")) {
        path.substring(0, path.length());
    }
    org.express4j.render.FreemarkerRender.render(path, models, getWriter());
}