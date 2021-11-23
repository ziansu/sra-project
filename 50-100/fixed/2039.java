@java.lang.Override
public void run() {
    try {
        Runner.saveStuffIntoDatabase(stockIndex);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        infoLabel.setText(information.GUIText.DATA_SAVED);
        classifyButton.setEnabled(true);
        saveButton.setEnabled(true);
    }
}