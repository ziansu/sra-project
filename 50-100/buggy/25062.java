@java.lang.Override
public void passVideos(java.util.ArrayList<com.example.android.movie_review_app.data.Video> videos) {
    videoList = videos;
    if ((videos.size()) == 0) {
        videoCarView.setVisibility(View.GONE);
    }else {
        videoCarView.setVisibility(View.VISIBLE);
    }
    com.example.android.movie_review_app.ui.VideoListAdapter videoListAdapter = new com.example.android.movie_review_app.ui.VideoListAdapter(videos, this);
    video_recyclerView.setAdapter(videoListAdapter);
    video_recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getActivity(), android.support.v7.widget.LinearLayoutManager.HORIZONTAL, false));
}