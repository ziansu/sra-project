public boolean foundBullet() {
    boolean found = false;
    if (((getAgentX()) == (edu.cpp.cs.cs141.Project.GameEngine.bldg.getBulletX())) && ((getAgentY()) == (edu.cpp.cs.cs141.Project.GameEngine.bldg.getBulletY()))) {
        found = true;
        edu.cpp.cs.cs141.Project.GameEngine.bldg.getGun().reload();
    }
    return found;
}