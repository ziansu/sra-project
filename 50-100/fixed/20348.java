protected void setPath(com.badlogic.gdx.math.Vector2 target) {
    if ((((path) != null) && ((path.size()) > 0)) && (path.get(((path.size()) - 1)).equals(target)))
        return ;
    else
        path = new com.dreamteam.villageTycoon.utils.PathFinder(getPosition(), target, ((com.dreamteam.villageTycoon.frameworkTest.TestScene) (getScene())).getMap().getTiles()).getPath(true);
    
}