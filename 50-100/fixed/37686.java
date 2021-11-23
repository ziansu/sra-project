public static com.ae3317.xisthename.movetivity.YouTube.YouTubePlayerFragment newInstance(@android.support.annotation.NonNull
java.lang.String youtubeId, @android.support.annotation.NonNull
java.lang.String apiKey, @android.support.annotation.Nullable
@android.support.annotation.StyleRes
java.lang.Integer themeResourceId, boolean enableDebugLogging) {
    com.ae3317.xisthename.movetivity.YouTube.YouTubePlayerFragment frag = new com.ae3317.xisthename.movetivity.YouTube.YouTubePlayerFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putString(com.ae3317.xisthename.movetivity.YouTube.YouTubePlayerFragment.ARG_VIDEO_YOUTUBE_ID, youtubeId);
    args.putString(com.ae3317.xisthename.movetivity.YouTube.YouTubePlayerFragment.ARG_GOOGLE_API_KEY, apiKey);
    if (themeResourceId != null) {
        args.putInt(com.ae3317.xisthename.movetivity.YouTube.YouTubePlayerFragment.ARG_THEME_RESOURCE_ID, themeResourceId);
    }
    frag.setArguments(args);
    return frag;
}