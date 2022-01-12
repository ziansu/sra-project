@java.lang.Override
public void onClick(android.view.View view) {
    if ((isAdded()) && (!(adapter.isRowChecked(view)))) {
        android.content.Intent intent = new android.content.Intent(android.media.RingtoneManager.ACTION_RINGTONE_PICKER);
        intent.putExtra(RingtoneManager.EXTRA_RINGTONE_TYPE, RingtoneManager.TYPE_NOTIFICATION);
        intent.putExtra(RingtoneManager.EXTRA_RINGTONE_TITLE, getString(R.string.Ringtone_picker));
        intent.putExtra(RingtoneManager.EXTRA_RINGTONE_EXISTING_URI, getRingtoneUri(requestCode));
        startActivityForResult(intent, requestCode);
    }else {
        adapter.setRowChecked(view, false);
    }
}