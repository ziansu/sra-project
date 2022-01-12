private void setOnOff() {
    if (0 == (onoff))
        msg = ("msg-[{\"requestType\":" + (Command.HostCommandTypeOn)) + "}]";
    else
        msg = ("msg-[{\"requestType\":" + (Command.HostCommandTypeOff)) + "}]";
    
    out.println(msg);
    onoff = ((onoff) + 1) % 2;
}