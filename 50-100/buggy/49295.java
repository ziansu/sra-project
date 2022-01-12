public void onAnalog(final java.lang.String name, final float value, final float tpf) {
    if (name.equals(com.mycompany.mavenproject1.GameInputState.MAPPING_NAME_SPAWN_BALL)) {
        final com.mycompany.mavenproject1.Ball ball = new com.mycompany.mavenproject1.Ball(assetManager);
        ball.spawn(app.getRootNode(), app.getPhysicsSpace());
    }
}