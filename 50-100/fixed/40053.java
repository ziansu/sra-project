@java.lang.Override
public void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id) {
    try {
        if (null != (audioPaths.get(position))) {
            android.content.Intent intent = new android.content.Intent(getActivity(), wairoadc.godiscover.view.activities.AudioPlayer.class);
            intent.putExtra(AudioPlayer.AUDIO_FILE_NAME, ((getActivity().getFilesDir()) + (audioPaths.get(position))));
            startActivity(intent);
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}