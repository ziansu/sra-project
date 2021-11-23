@java.lang.Override
public void onClick(android.view.View thumbnailView) {
    if ((youTubeVideo) != null) {
        free.rm.skytube.gui.businessobjects.YouTubePlayer.launch(youTubeVideo, ((android.content.Context) (listener)));
    }
}