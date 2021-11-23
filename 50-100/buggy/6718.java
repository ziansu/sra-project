public static edu.ucsd.sccn.LSL.StreamInfo[] resolve_streams(double wait_time) {
    com.sun.jna.Pointer[] buf = new com.sun.jna.Pointer[1024];
    int num = edu.ucsd.sccn.LSL.inst.lsl_resolve_all(buf, ((long) (buf.length)), wait_time);
    edu.ucsd.sccn.LSL.StreamInfo[] res = new edu.ucsd.sccn.LSL.StreamInfo[num];
    for (int k = 0; k < num; k++)
        res[k] = new edu.ucsd.sccn.LSL.StreamInfo(buf[k]);
    
    return res;
}