private void onResponse(com.hazelcast.core.Member member, java.lang.Object response) {
    assertNotDone();
    assertIsMember(member);
    triggerOnResponse(member, response);
    placeResponse(member, response);
    triggerOnComplete();
}