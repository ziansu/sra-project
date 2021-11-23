public static void main(java.lang.String[] args) throws java.lang.Exception {
    incremental.incrementalDriver.init();
    datastructure.IncrementalResult hsm2fsmRes = incremental.incrementalDriver.verify_initial("HSM2FSM");
    incremental.incrementalDriver.inc_verify_post_cache("HSM2FSM", "TEST", "IS2IS", hsm2fsmRes);
}