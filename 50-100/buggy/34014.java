@java.lang.Override
public void onSuccess(java.lang.Boolean value) {
    addResourceBtn.setEnabled(true);
    addResourceBtn.removeStyleName("disabled");
    if ((textBox) != null) {
        isHavingBadWordsInTextbox = value;
        org.ednovo.gooru.client.util.SetStyleForProfanity.SetStyleForProfanityForTextBox(textBox, label, value);
    }else {
        isHavingBadWordsInRichText = value;
        org.ednovo.gooru.client.util.SetStyleForProfanity.SetStyleForProfanityForTextArea(textArea, label, value);
    }
}