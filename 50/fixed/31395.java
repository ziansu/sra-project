public void destroyJoints(com.mygdx.game.Body body) {
    com.badlogic.gdx.utils.Array<com.mygdx.game.JointEdge> jointEdges = body.getJointList();
    for (com.mygdx.game.JointEdge edge : jointEdges) {
        com.mygdx.game.MainGame.WORLD.destroyJoint(edge.joint);
    }
}