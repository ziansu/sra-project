@java.lang.Override
public void onPodcastSelected(long podcastId) {
    android.util.Log.d("ID", ("" + podcastId));
    android.os.Bundle args = new android.os.Bundle();
    args.putLong("ID", podcastId);
    args.putString("TITLE", feedList.getFromId(podcastId).getTitle());
    createNewFragment(me.bromen.podgo.activities.MainActivity.MainFragments.EpisodeList, args);
}