public static io.datakernel.http.StaticServletForFiles create(io.datakernel.eventloop.Eventloop eventloop, java.util.concurrent.ExecutorService executor, java.net.URL url) {
    java.nio.file.Path path = java.nio.file.Paths.get(url.getPath());
    return new io.datakernel.http.StaticServletForFiles(eventloop, executor, path);
}