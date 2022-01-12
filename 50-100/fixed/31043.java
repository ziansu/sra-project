private com.linewx.law.instrument.parser.FirstCivilJudgementInstrumentParser.CostPerInformation calculateCostPer(java.lang.Long cost, java.lang.Boolean discountHalf, java.lang.Long costOnAccuser, java.lang.Long costOnDefendant) {
    java.lang.Long totalCost = cost;
    if (discountHalf) {
        totalCost = totalCost / 2;
    }
    if (cost.equals(0L)) {
        return new com.linewx.law.instrument.parser.FirstCivilJudgementInstrumentParser.CostPerInformation(50L, 50L);
    }
    java.lang.Long costOnAccuserPer = 100 - ((costOnAccuser * 100) / totalCost);
    java.lang.Long costOnDefendantPer = 100 - costOnAccuserPer;
    return new com.linewx.law.instrument.parser.FirstCivilJudgementInstrumentParser.CostPerInformation(costOnAccuserPer, costOnDefendantPer);
}