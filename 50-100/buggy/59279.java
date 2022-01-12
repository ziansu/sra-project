@java.lang.Override
public void onCaptionTextClicked(jp.co.cyberagent.android.gpuimage.CaptionText captionText) {
    if (captionText == null) {
        TextSetting.setVisibility(View.INVISIBLE);
        deleteIcon.setVisibility(View.INVISIBLE);
    }else {
        captionTextClicked = captionText;
        deleteIcon.setVisibility(View.VISIBLE);
        TextSetting.setVisibility(View.VISIBLE);
        getEditText();
        addItemOnSpiner();
        getColorSpinner();
    }
}