private void setOnOff() {
    if (0 == (onoff))
        msg = ("msg-[{\"requestType\":" + (Command.HostCommandTypeOn)) + "}]";
    else
        msg = ("msg-[{\"requestType\":" + (Command.HostCommandTypeOff)) + "}]";
    
    onoff = ((onoff) + 1) % 2;
}