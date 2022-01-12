public static com.example.user.encapsulate.VideoPlayerFragment newInstance(java.lang.String url) {
    com.example.user.encapsulate.VideoPlayerFragment videoPlayerFragment = new com.example.user.encapsulate.VideoPlayerFragment();
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString("url", url);
    videoPlayerFragment.setArguments(bundle);
    videoPlayerFragment.init();
    return videoPlayerFragment;
}