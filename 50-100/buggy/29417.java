@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.save_map_ok :
            android.util.Log.w(eu.intermodalics.tango_ros_streamer.android.SaveMapDialog.TAG, "OK");
            mCallbackListener.onClickOkSaveMapDialog(mNameEditText.getText().toString());
            dismiss();
            break;
        case R.id.save_map_cancel :
            android.util.Log.w(eu.intermodalics.tango_ros_streamer.android.SaveMapDialog.TAG, "CANCEL");
            dismiss();
            break;
    }
}