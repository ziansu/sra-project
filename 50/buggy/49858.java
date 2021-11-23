private static int getRequiredExperienceForNextLevel(int currentLevel) {
    return ((int) ((com.gpl.rpg.AndorsTrail.model.actor.Player.EXP_base) * (java.lang.Math.pow(currentLevel, ((com.gpl.rpg.AndorsTrail.model.actor.Player.EXP_powbase) + (currentLevel / (com.gpl.rpg.AndorsTrail.model.actor.Player.EXP_D)))))));
}