private nl.esciencecenter.xenon.filesystems.Path getPath(nl.esciencecenter.xenon.grpc.XenonProto.Path request) {
    if (XenonProto.Path.getDefaultInstance().getSeparator().equals(request.getSeparator())) {
        return new nl.esciencecenter.xenon.filesystems.Path(request.getPath());
    }
    java.lang.String[] elements = request.getPath().split(request.getSeparator());
    return new nl.esciencecenter.xenon.filesystems.Path(request.getSeparator().charAt(0), elements);
}