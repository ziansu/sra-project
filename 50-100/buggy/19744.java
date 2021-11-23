void filter(java.util.List<com.github.axet.vget.vhs.VideoDownload> sNextVideoURL, java.lang.String itag, java.net.URL url) {
    java.lang.Integer i = java.lang.Integer.decode(itag);
    com.github.axet.vget.vhs.YouTubeInfo.StreamInfo vd = itagMap.get(i);
    if ((vd.c) == (com.github.axet.vget.vhs.YouTubeInfo.Container.WEBM))
        return ;
    
    super.filter(sNextVideoURL, itag, url);
}