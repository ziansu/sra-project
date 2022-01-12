public void setBattleState(com.mygdx.enums.BattleStateEnum battleStateEnum) {
    battleInfo.setBattleState(battleStateEnum);
    if (battleStateEnum.equals(BattleStateEnum.IN_GAME)) {
        musicManager.setMusicAndPlay("fights");
    }else
        if ((battleStateEnum.equals(BattleStateEnum.GAME_OVER)) || (battleStateEnum.equals(BattleStateEnum.NOT_IN_BATTLE))) {
            if ((musicManager.getMusic()) != null) {
                musicManager.stopMusic();
            }
        }
    
}