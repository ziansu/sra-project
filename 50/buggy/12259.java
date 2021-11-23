@java.lang.Override
public void run() {
    if (messageToDisplay != "")
        ShowMsg(messageToDisplay, this, retVal_);
    else
        ShowMsg("未知错误", this);
    
}