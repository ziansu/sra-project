@java.lang.Override
public void onChange(com.google.gwt.event.dom.client.ChangeEvent event) {
    if (((permittedI.getText()) != null) && (!("".equals(permittedI.getText())))) {
        unpermittedI.clear();
        unpermittedI.setEnabled(false);
    }else {
        unpermittedI.setEnabled(true);
    }
}