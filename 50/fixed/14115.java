public void remove(nl.tudelft.model.Projectile proj) {
    if (projectiles.contains(proj))
        projectiles.remove(proj);
    
    if (obj.contains(proj))
        obj.remove(proj);
    
}