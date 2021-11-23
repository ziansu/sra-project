private void writeFile(xyz.luan.web.cthulhu.GcsFilename fileName, xyz.luan.web.cthulhu.Proxy.Request req) throws java.io.IOException {
    xyz.luan.web.cthulhu.GcsFileOptions options = new xyz.luan.web.cthulhu.GcsFileOptions.Builder().mimeType(req.contentType).build();
    xyz.luan.web.cthulhu.GcsOutputChannel outputChannel = gcsService.createOrReplace(fileName, options);
    com.google.common.io.ByteStreams.copy(req.is, java.nio.channels.Channels.newOutputStream(outputChannel));
    req.is.reset();
    outputChannel.close();
}