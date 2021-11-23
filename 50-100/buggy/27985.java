void setBattle(battle.Battle battle, boolean seenWild, map.weather.WeatherState weather, map.overworld.TerrainType terrain) {
    this.battle = battle;
    this.seenWild = seenWild;
    this.battle.setBaseWeather(weather);
    this.battle.setTerrainType(terrain, true);
    battleAnimationTime = gui.view.map.BattleState.BATTLE_INTRO_ANIMATION_LIFESPAN;
    battleImageSlideLeft = null;
    battleImageSlideRight = null;
    if (battle.isWildBattle()) {
        SoundPlayer.soundPlayer.playMusic(SoundTitle.WILD_POKEMON_BATTLE);
    }else {
        SoundPlayer.soundPlayer.playMusic(SoundTitle.TRAINER_BATTLE);
    }
}