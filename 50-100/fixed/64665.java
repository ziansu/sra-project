public void showLastStage() {
    try {
        com.gamefactoryx.cheers.controller.StageEnum stageEnum = stageHistory.removeLast();
        switch (stageEnum) {
            case BUS_DRIVING_STAGE_FIRST_PHASE :
            case BUS_DRIVING_STAGE_SECOND_PHASE :
            case BUS_DRIVING_STAGE_THIRD_PHASE :
            case BUS_DRIVING_STAGE_FOURTH_PHASE :
                showStage(StageEnum.NEW_GAME_STAGE, true);
                break;
            default :
                showStage(stageEnum, true);
        }
    } catch (java.lang.Exception e) {
        showStage(StageEnum.MAIN_STAGE);
    }
}