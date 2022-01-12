public java.lang.Void call() throws java.lang.Exception {
    sendBack(param, invoke(org.flg.hiromi.pulsecontroller.PulseCommChannel.GET, ("/val?param=" + param)), false);
    return null;
}