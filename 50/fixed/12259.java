@java.lang.Override
public void run() {
    if (!(messageToDisplay.equals("")))
        ShowMsg(messageToDisplay, this, retVal_);
    else
        ShowMsg("未知错误", this);
    
}