@java.lang.Override
public void onItemClick(android.view.View view, int position) {
    android.widget.Toast.makeText(getContext(), itemList.get(position).getRecordingItem().getName(), Toast.LENGTH_SHORT).show();
    if (isPlaying) {
        stopPlaying();
    }
    startPlaying(itemList.get(position).getRecordingItem().getFilePath());
}