@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String newMeaning = meaningsInput.getText().trim();
    if (!(newMeaning.equals(""))) {
        parent.getWordManager().addMeaning(currentWord, newMeaning);
        if ((strength) == (-1))
            parent.notifyStrengthChange(currentWord, 0);
        
        parent.notifyMeaningChange(currentWord);
        meaningsModel.addElement(newMeaning);
        meaningsInput.setText("");
    }
}