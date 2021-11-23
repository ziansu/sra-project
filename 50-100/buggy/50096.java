private io.grpc.examples.movieservice.Movie getMovieBlockingStub(io.grpc.examples.movieservice.MovieRequest request) {
    io.grpc.examples.movieservice.Movie movie;
    try {
        movie = blockingStub.getMovieDetails(request);
        return movie;
    } catch (io.grpc.StatusRuntimeException e) {
        io.grpc.examples.movieservice.MovieServiceClient.info(java.lang.String.format("RPC failed: {0} - {1}", e.getMessage(), e.getStackTrace()));
        return null;
    }
}