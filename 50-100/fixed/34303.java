@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.iv_speaker :
            if (!(tts.isSpeaking())) {
                if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
                    tts.speak(listFavorite.get(index), TextToSpeech.QUEUE_FLUSH, null, null);
                }
            }
            break;
        case R.id.ibtn_submit :
            onBtnSubmitClick(view);
            break;
    }
}