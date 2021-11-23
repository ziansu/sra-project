public void woundTeammates() {
    com.badlogic.gdx.utils.Array<com.esbjon.inventories.Teammate> teammates = inventory.getTeammates();
    while ((teammates.size) > 0) {
        teammates.get(((teammates.size) - 1)).wound();
    } 
}