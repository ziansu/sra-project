@java.lang.Override
protected com.smartdevicelink.proxy.RPCMessage createMessage() {
    com.smartdevicelink.proxy.rpc.OnSdlChoiceChosen msg = new com.smartdevicelink.proxy.rpc.OnSdlChoiceChosen();
    com.smartdevicelink.proxy.rpc.OnSdlChoiceChosen.SdlChoice sdlChoice = msg.new com.smartdevicelink.proxy.rpc.OnSdlChoiceChosen.SdlChoice(com.smartdevicelink.test.Test.GENERAL_CHOICE);
    msg.setTriggerSource(Test.GENERAL_TRIGGERSOURCE);
    msg.setSdlChoice(sdlChoice);
    return msg;
}