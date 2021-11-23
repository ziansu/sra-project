@java.lang.Override
public void actionPerformed(com.codename1.ui.events.ActionEvent evt) {
    com.codename1.io.Log.p("Action event triggered");
    com.codename1.ui.spinner.Picker datePicker = new com.codename1.ui.spinner.Picker();
    try {
        com.codename1.ui.Display.getInstance().showNativePicker(Display.PICKER_TYPE_DATE, this, value, metaData);
        com.codename1.io.Storage.getInstance().writeObject("Date", value);
        com.codename1.io.Log.p(value.toString());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}