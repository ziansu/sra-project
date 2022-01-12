public void startTestMenuItemAction() {
    if ((mainView.getCurrentlySelectedVocabList()) == null) {
        reportNoVocabListSelectedError();
    }else {
        java.lang.Object[] options = new java.lang.Object[]{ com.tkomiya.models.Vocab.SUPPORTED_LANGUAGES[1] , com.tkomiya.models.Vocab.SUPPORTED_LANGUAGES[2] };
        int languageToTest = mainView.showOptionDialog("Which language would you like to test?", "Please enter option", options, Vocab.KOREAN);
        if (languageToTest != (javax.swing.JOptionPane.CANCEL_OPTION)) {
            new com.tkomiya.views.TypedTest(mainView.getCurrentlySelectedVocabList(), (languageToTest + 1));
        }
    }
}