public void setStatusBarState(com.criptext.monkeykitui.util.Utils.ConnectionStatus status) {
    if ((monkeyFragmentManager) == null)
        return ;
    
    monkeyFragmentManager.showStatusNotification(status);
}