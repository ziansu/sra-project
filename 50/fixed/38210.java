public static io.datakernel.http.StaticServletForFiles create(io.datakernel.eventloop.Eventloop eventloop, java.util.concurrent.ExecutorService executor, java.nio.file.Path path) {
    return new io.datakernel.http.StaticServletForFiles(eventloop, executor, path);
}