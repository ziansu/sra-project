@java.lang.Override
public void run() {
    java.lang.System.err.println("tcpCommand: 303");
    java.lang.System.out.println("onActionHandler for code 303");
    java.lang.String message = ((java.lang.String) (((java.util.ArrayList) (datas)).get(0)));
    if ((message != null) && ((com.voipsitchozr.main.VoipManager.getInstance().chatView) != null))
        com.voipsitchozr.main.VoipManager.getInstance().chatView.addItem(message);
    
}