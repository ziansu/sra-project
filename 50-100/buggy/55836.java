@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String playlistName = ((android.widget.TextView) (view.findViewById(R.id.mainTitle))).getText().toString();
    android.content.Intent intent = new android.content.Intent(getActivity(), com.chiri.finalmusicplayer.service.MusicService.class);
    intent.putExtra(Codes.TAG_TYPE, Codes.TAG_PLAYLIST);
    intent.putExtra(Codes.TAG_PLAYLIST_NAME, playlistName);
    getActivity().setResult(android.app.Activity.RESULT_OK, intent);
    getActivity().finish();
}