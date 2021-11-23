public static void spawn(int delta) throws org.newdawn.slick.SlickException {
    if ((Entity.Fence.delay) > 0) {
        Entity.Fence.delay -= delta;
    }else {
        int random = Entity.Fence.randomGen.nextInt(60);
        if (random <= 11) {
            getWorld().addObject(new Entity.Fence((random * 48), 8));
        }
        Entity.Fence.delay = 1000;
    }
}