public org.ejs.gui.images.ColorOctree getOctree() {
    if ((octree) == null)
        octree = new org.ejs.gui.images.ColorOctree(3, true, false);
    
    return octree;
}