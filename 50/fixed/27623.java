public void addEnemyLocationList(int i, int j, java.lang.Character character) {
    enemyLocationList.put(new com.badlogic.gdx.math.Vector2((j * (com.chaowang.ddgame.PublicParameter.MAP_PIXEL_SIZE)), (i * (com.chaowang.ddgame.PublicParameter.MAP_PIXEL_SIZE))), character);
}