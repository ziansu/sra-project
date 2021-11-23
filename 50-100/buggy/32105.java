@java.lang.Override
public void onSuccess(java.lang.String result) {
    if ((position) > (result.length())) {
        if (charFreq < (result.length())) {
            position = charFreq;
        }else {
            position = 0;
            _toastMaker.showToast("Very short text on url. Showing first character");
        }
    }
    setText(java.lang.Character.toString(result.charAt(position)));
}