@java.lang.Override
public void safeRun() {
    int autoCapitalizationFlag = text.getInputType();
    autoCapitalizationFlag &= ~(((android.text.InputType.TYPE_TEXT_FLAG_CAP_WORDS) | (android.text.InputType.TYPE_TEXT_FLAG_CAP_SENTENCES)) | (android.text.InputType.TYPE_TEXT_FLAG_CAP_CHARACTERS));
    switch (autoCapitalizationType) {
        case 1 :
            autoCapitalizationFlag |= android.text.InputType.TYPE_TEXT_FLAG_CAP_WORDS;
            break;
        case 2 :
            autoCapitalizationFlag |= android.text.InputType.TYPE_TEXT_FLAG_CAP_SENTENCES;
            break;
        case 3 :
            autoCapitalizationFlag |= android.text.InputType.TYPE_TEXT_FLAG_CAP_CHARACTERS;
            break;
        case 0 :
        default :
            break;
    }
    text.setInputType(autoCapitalizationFlag);
}