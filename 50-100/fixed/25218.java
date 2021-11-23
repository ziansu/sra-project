@java.lang.Override
public void onStop() {
    super.onStop();
    if ((previewImage) != null) {
        savePreviewSetting(previewImage);
        if (lightEffRB.isChecked()) {
            setFilter(1);
        }else
            if (darkEffRB.isChecked()) {
                setFilter(2);
            }else {
                setFilter(0);
            }
        
    }
}