private void randomizeLocation(org.epoxide.ld39.world.World world) {
    java.util.Random rand = new java.util.Random();
    while (true) {
        int randX = rand.nextInt(world.getMapWidth());
        int randY = rand.nextInt(world.getMapHeight());
        if (world.checkClear(randX, randY)) {
            continue;
        }
        this.x = randX;
        this.y = randY;
        break;
    } 
}