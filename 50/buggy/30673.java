public static void removeSenderState(org.apache.catalina.tribes.Member member) {
    synchronized(org.apache.catalina.tribes.transport.SenderState.memberStates) {
        org.apache.catalina.tribes.transport.SenderState.memberStates.remove(member);
    }
}