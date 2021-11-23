public void update() {
    for (world.Agent a : agents) {
        a.update();
        if (a.objReached())
            a.setObj(this.randomPointInsideWorld());
        
        a.getDir().rotateInDirectionOf(a.getDirToObj());
    }
}