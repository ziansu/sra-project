@java.lang.Override
public void safeRun() {
    com.dava.framework.JNITextField.TextField text = com.dava.framework.JNITextField.GetTextField(id);
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