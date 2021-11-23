@java.lang.Override
public void onResult(int requestCode, int resultCode, @android.support.annotation.Nullable
android.content.Intent data) {
    if (((requestCode == (id)) && (resultCode != (android.app.Activity.RESULT_OK))) || (data == null)) {
        return ;
    }
    result = ru.spbau.mit.placenotifier.PlacePicker.getSelectedPoint(data);
    updateCamera();
}