@java.lang.Override
public void safeRun() {
    final android.widget.EditText text = com.dava.framework.JNITextField.GetTextField(id);
    int spellCheckingFlag = text.getInputType();
    switch (spellCheckingType) {
        case 0 :
        case 2 :
            spellCheckingFlag |= android.text.InputType.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            break;
        case 1 :
        default :
            spellCheckingFlag &= ~(android.text.InputType.TYPE_TEXT_FLAG_AUTO_COMPLETE);
            break;
    }
    text.setInputType(spellCheckingFlag);
}