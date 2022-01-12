public boolean render() {
    java.lang.System.out.println("in render");
    if ((firstObj) == null) {
        return false;
    }
    if ((firstObj) != null) {
        example.Projectile.ProjectileObj tempObj = firstObj;
        while (tempObj != (lastObj)) {
            tempObj.render(projectileSprite);
            tempObj = tempObj.getNext();
        } 
        tempObj.render(projectileSprite);
    }
    return true;
}