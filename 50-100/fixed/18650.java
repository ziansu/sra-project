public java.util.List<amagi82.modularcharactersheetcreator.models.Choice> getList(amagi82.modularcharactersheetcreator.models.game_systems.Game.Category category) {
    java.util.List<amagi82.modularcharactersheetcreator.models.Choice> choices = new java.util.ArrayList<>();
    int i = 0;
    for (amagi82.modularcharactersheetcreator.models.game_systems.Game.System system : amagi82.modularcharactersheetcreator.models.game_systems.Game.System.values()) {
        if ((system.getCategory()) == category)
            choices.add(new amagi82.modularcharactersheetcreator.models.Choice(i, system.name(), system.getName(), system.getDrawable()));
        
        i++;
    }
    return choices;
}