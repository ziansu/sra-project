@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent i = new android.content.Intent(getActivity(), com.easy.player.activity.FullScreenPlayActivity.class);
    i.putExtra("po_media", mMediaList.get(position));
    startActivity(i);
}