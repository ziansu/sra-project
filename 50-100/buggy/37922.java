public static byte[] pipeOutBytes(im.webuzz.pilet.HttpRequest request, java.lang.String cookies, im.webuzz.pilet.HttpResponse response, java.lang.String type, java.lang.String encoding, byte[] content, long expired) {
    return im.webuzz.pilet.HttpWorkerUtils.pipeOutBytes(request, cookies, response, type, encoding, content, null, expired);
}