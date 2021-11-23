public static void pipeOutBytes(im.webuzz.pilet.HttpRequest request, java.lang.String cookies, im.webuzz.pilet.HttpResponse response, java.lang.String type, java.lang.String encoding, byte[] content, java.lang.String eTag) {
    im.webuzz.pilet.HttpWorkerUtils.pipeOutBytes(request, cookies, response, type, encoding, content, eTag, (eTag != null ? 0 : -1));
}