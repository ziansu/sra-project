public void run() {
    com.juksoft.bbvocab.DictionaryScreen newScreen = new com.juksoft.bbvocab.DictionaryScreen();
    net.rim.device.api.ui.UiApplication.getUiApplication().popScreen(holdingScreen);
    net.rim.device.api.ui.UiApplication.getUiApplication().pushScreen(newScreen);
    newScreen.setWordText(((java.lang.String) (wordVec.elementAt(wordListField.getSelectedIndex()))));
    java.lang.Thread thread = new com.juksoft.bbvocab.GetDefinitionThread(newScreen);
    thread.start();
}