public static edu.ucsd.sccn.LSL.StreamInfo[] resolve_stream(java.lang.String pred, int minimum, double timeout) {
    com.sun.jna.Pointer[] buf = new com.sun.jna.Pointer[1024];
    int num = edu.ucsd.sccn.LSL.inst.lsl_resolve_bypred(buf, ((long) (buf.length)), pred, minimum, timeout);
    edu.ucsd.sccn.LSL.StreamInfo[] res = new edu.ucsd.sccn.LSL.StreamInfo[num];
    for (int k = 0; k < num; k++)
        res[k] = new edu.ucsd.sccn.LSL.StreamInfo(buf[k]);
    
    return res;
}