public static void setBattle(battle.Battle battle, boolean seenWild, map.weather.WeatherState weather, map.overworld.TerrainType terrain) {
    ((gui.view.map.BattleState) (gui.view.map.VisualState.BATTLE.handler)).setBattle(battle, seenWild, weather, terrain);
}