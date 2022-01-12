private void doEntityFall(megamek.server.Entity entity, megamek.server.Coords fallPos, int height, int roll) {
    doEntityFall(entity, fallPos, height, megamek.server.Compute.d6(1), roll);
}