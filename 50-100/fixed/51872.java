@java.lang.Override
public void onPortItemSelected(int position) {
    java.lang.String[] portNames = mModel.getPortNames();
    scs71.com.scscws.ui.main_menu.MainMenuContract.View view = getViewOrThrow();
    java.lang.String portName = null;
    if (position == 0) {
        portName = "";
    }else
        if (position < (portNames.length)) {
            portName = portNames[position];
        }else {
            throw new java.lang.IllegalArgumentException("Invalid position");
        }
    
    view.displayLastedEdiOf(portName);
}