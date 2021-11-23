public static io.aeron.agent.EventCode get(final int id) {
    if ((id < 0) || (id > (io.aeron.agent.EventCode.EVENT_CODE_BY_ID.length))) {
        throw new java.lang.IllegalArgumentException(("No EventCode for ID: " + id));
    }
    final io.aeron.agent.EventCode code = io.aeron.agent.EventCode.EVENT_CODE_BY_ID[id];
    if (null == code) {
        throw new java.lang.IllegalArgumentException(("No EventCode for ID: " + id));
    }
    return code;
}