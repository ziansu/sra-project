@java.lang.Override
public void notifyChannelTalkMode(com.gotye.api.voichannel.TalkMode talkMode) {
    java.lang.String string = "";
    if (talkMode == (com.gotye.api.voichannel.TalkMode.AdministratorOnly)) {
        string = "Admin Only";
        bChannelTalkMode = true;
    }else
        if (talkMode == (com.gotye.api.voichannel.TalkMode.Freedom)) {
            string = "Free Talking";
            bChannelTalkMode = false;
        }
    
    mode = string;
    if ((mProxy) != null)
        mProxy.notifyChannelTalkMode(talkMode);
    
}