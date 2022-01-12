@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putSerializable(com.stationmillenium.android.activities.fragments.PlayerFragment.SONG_DATA_SAVE, binding.getSongData());
    outState.putString(com.stationmillenium.android.activities.fragments.PlayerFragment.CURRENT_TIME_SAVE_MINUTES, binding.getPlayingMinutes());
    outState.putString(com.stationmillenium.android.activities.fragments.PlayerFragment.CURRENT_TIME_SAVE_SECONDS, binding.getPlayingSeconds());
    outState.putSerializable(com.stationmillenium.android.activities.fragments.PlayerFragment.PLAYER_STATE_SAVE, binding.getPlayerState());
    outState.putStringArrayList(com.stationmillenium.android.activities.fragments.PlayerFragment.HISTORY_LIST_SAVE, new java.util.ArrayList(binding.getHistoryArray()));
    super.onSaveInstanceState(outState);
}