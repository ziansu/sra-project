@java.lang.Override
public void run() {
    try {
        Runner.saveStuffIntoDatabase(stockIndex);
    } catch (javax.xml.parsers.ParserConfigurationException | org.xml.sax.SAXException | java.io.IOException e) {
        e.printStackTrace();
    }
    infoLabel.setText(information.GUIText.DATA_SAVED);
    classifyButton.setEnabled(true);
    saveButton.setEnabled(true);
}