@java.lang.Override
public jk.kamoru.crazy.video.domain.Video getVideo(java.lang.String opus) {
    videoSource();
    if (videoMap.containsKey(opus.toLowerCase()))
        return videoMap.get(opus.toLowerCase());
    else
        if (isArchive)
            return null;
        else
            throw new jk.kamoru.crazy.video.VideoNotFoundException(opus);
        
    
}