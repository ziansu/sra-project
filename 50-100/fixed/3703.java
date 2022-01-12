private static RtcModel.Stack rtcStack(org.netbeans.modules.cnd.debugger.dbx.rtc.RtcModel model, org.netbeans.modules.cnd.debugger.dbx.rtc.GPDbxStack gstack) {
    org.netbeans.modules.cnd.debugger.dbx.rtc.RtcModel.Stack rstack = model.newStack(gstack.nframes);
    for (int fx = 0; fx < (gstack.nframes); fx++)
        rstack.setFrame(fx, org.netbeans.modules.cnd.debugger.dbx.rtc.GpRtcUtil.rtcFrame(gstack.frame[fx]));
    
    return rstack;
}