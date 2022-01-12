@java.lang.Override
public void run() {
    if ((mPickerController) == null)
        return ;
    
    final android.os.Bundle bundle = new android.os.Bundle();
    try {
        setOptionsOnBundle(data.getJSONObject(0), bundle);
        mPickerController.updateUI(bundle);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}