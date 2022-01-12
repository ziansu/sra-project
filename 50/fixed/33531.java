public void onClick(net.joaolourenco.legame.graphics.menu.Menu m) {
    m.close();
    net.joaolourenco.legame.Registry.getMainClass().setWorld(new net.joaolourenco.legame.world.Tutorial());
}