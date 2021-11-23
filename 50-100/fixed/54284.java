public static void make_batch_of_trial_stubs(test.transactions.cargoSystem.dataTypes.GalleonBarge barge, test.transactions.cargoSystem.dataTypes.OrderSlip order) {
    int numTrials = order.specs.getValInt(VarNameReg.NUM_TRIALS);
    long kindOfTrial = order.specs.getValLong(VarNameReg.KIND);
    long allottedMillisecs = order.specs.getValLong(VarNameReg.ALLOTTED);
    java.util.List<test.dbDataAbstractions.entities.tables.TrialTable> trials;
    trials = test.transactions.util.forOwnedMainlyByOneTable.trial.TrialTransUtil.makeBatchOfTrialStubs(numTrials, kindOfTrial, allottedMillisecs);
    java.util.List<test.dbDataAbstractions.entities.bases.BaseEntity> bel = test.dbDataAbstractions.entities.EntityUtil.downCastEntities(trials);
    barge.fillOrder(order, bel);
}