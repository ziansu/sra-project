public static com.ibm.kdd.core.EventAccount MountAccount(com.ibm.kdd.core.EventAccount ea, com.ibm.kdd.core.TemporalItem[] events) throws java.io.IOException {
    for (com.ibm.kdd.core.TemporalItem e : events) {
        ea.incrNumEventOfAccount(e.type);
    }
    return ea;
}