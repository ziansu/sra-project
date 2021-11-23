protected void createNodes(com.artronics.sdwn.domain.entities.NetworkSession session) {
    sink1.setSession(session);
    sink2.setSession(session);
    sink1.setType(SdwnNodeEntity.Type.SINK);
    sink2.setType(SdwnNodeEntity.Type.SINK);
    sameAddNode1.setSession(session);
    sameAddNode2.setSession(session);
    node135.setSession(session);
    node136.setSession(session);
    node137.setSession(session);
    node245.setSession(session);
    node246.setSession(session);
}