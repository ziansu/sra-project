private static int getRequiredExperienceForNextLevel(int currentLevel) {
    return ((int) (((com.gpl.rpg.AndorsTrail.model.actor.Player.EXP_base) * currentLevel) * currentLevel));
}