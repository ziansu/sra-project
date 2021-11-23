void setBattle(battle.Battle battle, boolean seenWild) {
    this.battle = battle;
    this.seenWild = seenWild;
    battleAnimationTime = gui.view.map.BattleState.BATTLE_INTRO_ANIMATION_LIFESPAN;
    battleImageSlideLeft = null;
    battleImageSlideRight = null;
    if (battle.isWildBattle()) {
        SoundPlayer.soundPlayer.playMusic(SoundTitle.WILD_POKEMON_BATTLE);
    }else {
        SoundPlayer.soundPlayer.playMusic(SoundTitle.TRAINER_BATTLE);
    }
}