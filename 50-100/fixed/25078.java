public static void playerEnterNewFloor(final com.badlogic.ashley.core.Entity player, final map.Map map, final int newFloor) {
    Mappers.hitbox.get(player).setIntangible(true);
    map.getMain().getHud().fadeToColor(new com.badlogic.gdx.graphics.Color(1.0F, 1.0F, 1.0F, 1.0F), 3.5F, new com.badlogic.gdx.utils.Timer.Task() {
        @java.lang.Override
        public void run() {
            map.enterNewFloor(newFloor);
            Mappers.hitbox.get(player).setIntangible(false);
        }
    });
}