@java.lang.Override
public void onKeyDown(com.google.gwt.event.dom.client.KeyDownEvent event) {
    int keyCode = event.getNativeKeyCode();
    if ((keyCode == (com.google.gwt.event.dom.client.KeyCodes.KEY_ENTER)) && ((choiceList.getSelectedIndex()) != (-1))) {
        java.lang.System.out.println("ENTÖÖÖR!");
        event.preventDefault();
        event.stopPropagation();
        select();
    }else
        if (keyCode == (com.google.gwt.event.dom.client.KeyCodes.KEY_ESCAPE)) {
            java.lang.System.out.println("ESCÄÄÄP!");
            event.preventDefault();
            close();
        }
    
}