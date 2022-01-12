@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.lta_setAudio_btn :
            chooseAudio();
            break;
        default :
            super.onClick(v);
    }
}