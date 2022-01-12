@java.lang.Override
public void safeRun() {
    int autoCorrectionFlag = text.getInputType();
    switch (autoCorrectionType) {
        case 0 :
        case 2 :
            autoCorrectionFlag |= android.text.InputType.TYPE_TEXT_FLAG_AUTO_CORRECT;
            break;
        case 1 :
        default :
            autoCorrectionFlag &= ~(android.text.InputType.TYPE_TEXT_FLAG_AUTO_CORRECT);
            break;
    }
    text.setInputType(autoCorrectionFlag);
}