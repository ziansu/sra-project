@java.lang.SuppressWarnings(value = "unchecked")
public static void initControler() {
    com.rpsg.rpg.system.controller.HeroController.heros = ((java.util.ArrayList<com.rpsg.rpg.object.rpg.Hero>) (GameViews.global.currentHeros.clone()));
    com.rpsg.rpg.system.controller.HeroController.allHeros = ((java.util.ArrayList<com.rpsg.rpg.object.rpg.Hero>) (GameViews.global.heros.clone()));
}