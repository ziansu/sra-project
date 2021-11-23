@java.lang.Override
public void doIfFailed() {
    if (((socket) == null) || (!(connectedToSocket))) {
        if ((act) != null)
            if ((((ru.racoondeveloper.contactchat.MainActivity) (act)).splScreen) != null)
                ((ru.racoondeveloper.contactchat.MainActivity) (act)).splScreen.setButtonActive();
            else
                reconnect();
            
        
    }
}