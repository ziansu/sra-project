private void onResponse(com.hazelcast.core.Member member, java.lang.Object response) {
    assertNotDone();
    assertIsMember(member);
    placeResponse(member, response);
    triggerOnResponse(member, response);
    triggerOnComplete();
}