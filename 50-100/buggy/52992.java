private boolean isNeedLoadStagesAndClassifications(an.dpr.cyclingresultsapi.domain.Competition comp) {
    boolean ret = false;
    if (comp.getCompetitionType().equals(CompetitionType.STAGES)) {
        if (((dao.getCompetitionClassifications(comp).size()) == 0) || ((dao.getCompetitionStages(comp).size()) == 0)) {
            ret = true;
        }else
            if (!(competitionFinalizada(comp))) {
                ret = true;
            }
        
    }
    return ret;
}