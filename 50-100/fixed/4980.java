public int pull_chunk(int[] data_buffer, double[] timestamp_buffer, double timeout) throws java.lang.Exception {
    int[] ec = new int[]{ 0 };
    long res = edu.ucsd.sccn.LSL.inst.lsl_pull_chunk_i(obj, data_buffer, timestamp_buffer, data_buffer.length, timestamp_buffer.length, timeout, ec);
    edu.ucsd.sccn.LSL.check_error(ec);
    return ((int) (res));
}