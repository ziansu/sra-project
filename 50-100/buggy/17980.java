@java.lang.Override
public jk.kamoru.crazy.video.domain.Video getVideo(java.lang.String opus) {
    videoSource();
    if (videoMap.containsKey(opus.toLowerCase()))
        return videoMap.get(opus.toLowerCase());
    else
        if (isArchive)
            return new jk.kamoru.crazy.video.domain.Video();
        else
            throw new jk.kamoru.crazy.video.VideoNotFoundException(opus);
        
    
}