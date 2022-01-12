public com.mygdx.game.entity.GameObject findGameObject(java.lang.String name) {
    if (name != null) {
        for (int i = 0; i < (gameObjectArray.size); i++) {
            if (name.equals(gameObjectArray.get(i).getName())) {
                return gameObjectArray.get(i);
            }
        }
    }
    return null;
}