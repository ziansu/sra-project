private void removeBodiesSafely() {
    for (int i = 0; i < (WorldConstants.BODIES.size()); i++) {
        body = WorldConstants.BODIES.get(i);
        if ((body) != null) {
            if ((body.getUserData()) != null) {
                if (body.getUserData().equals("dead")) {
                    WorldConstants.CURRENT_WORLD.destroyBody(body);
                }
            }
        }
    }
}