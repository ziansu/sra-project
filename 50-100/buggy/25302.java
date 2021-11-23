public static java.lang.Process waitForMatch() throws java.io.IOException, java.net.URISyntaxException {
    final java.net.URI uri;
    final java.net.URI exe;
    uri = com.ukz.service.FileLocationService.getJarURI();
    exe = com.ukz.service.FileLocationService.getFile(uri, com.ukz.service.MatchmakingWaitService.HOOK_EXE);
    return com.ukz.service.MatchmakingWaitService.rt.exec(((((exe.getPath()) + " \"") + (com.ukz.service.MatchmakingWaitService.WINDOW_NAME)) + "\""));
}