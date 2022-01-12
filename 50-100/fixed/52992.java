private boolean isNeedLoadStagesAndClassifications(an.dpr.cyclingresultsapi.domain.Competition comp) {
    boolean ret = false;
    if (CompetitionType.STAGES.equals(comp.getCompetitionType())) {
        if (((dao.getCompetitionClassifications(comp).size()) == 0) || ((dao.getCompetitionStages(comp).size()) == 0)) {
            ret = true;
        }else
            if (!(competitionFinalizada(comp))) {
                ret = true;
            }
        
    }
    return ret;
}