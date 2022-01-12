public boolean isCurrentStage1() {
    boolean result = false;
    eg.com.etisalat.contest.domain.ContestStage stage = this.getCurrentStage();
    if (stage != null) {
        result = (stage.getStageOrder()) == 1;
    }
    return true;
}