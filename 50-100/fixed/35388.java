public static void spawnAlgae() {
    for (int i = 0; i < (Params.refresh_algae_count); i++) {
        try {
            assignment4.Critter.makeCritter("Algae");
        } catch (assignment4.InvalidCritterException e) {
            e.printStackTrace();
        }
        assignment4.CritterWorld.getWorld()[java.lang.Math.abs(((assignment4.Critter.getRandomInt(Params.world_height)) - 1))][java.lang.Math.abs(assignment4.Critter.getRandomInt(((Params.world_width) - 1)))] = new assignment4.Algae();
    }
}