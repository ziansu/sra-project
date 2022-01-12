@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends org.jevis.api.JEVisClass> observable, org.jevis.api.JEVisClass oldValue, org.jevis.api.JEVisClass newValue) {
    try {
        fName.setText(newValue.getName());
    } catch (org.jevis.api.JEVisException ex) {
        java.util.logging.Logger.getLogger(org.jevis.jeconfig.plugin.object.NewObjectDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}