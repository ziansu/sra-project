private void importTrial_buttonActionPerformed(java.awt.event.ActionEvent evt) {
    boolean[] success = new boolean[1];
    java.lang.String trial_name = importTrial_textfield.getText();
    Trial new_trial = new Trial();
    new_trial = new_trial.ReadDataFile(trial_name, success);
    if (success[0]) {
        settings.AddTrial(new_trial);
        SetTrialTextArea();
        UpdateTrialsComboBox();
    }else
        java.lang.System.out.println("Error getting trial data");
    
}