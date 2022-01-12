public boolean wait_for_consumers(double timeout) {
    return (edu.ucsd.sccn.LSL.inst.lsl_wait_for_consumers(obj, timeout)) > 0;
}