@java.lang.SuppressWarnings(value = "PMD.UselessParentheses")
public static java.util.List<us.freeandfair.corla.model.CastVoteRecord> computeBallotOrder(final us.freeandfair.corla.model.CountyDashboard the_cdb, final int the_round, final boolean the_audited) {
    if ((the_round <= 0) || ((the_cdb.rounds().size()) < the_round)) {
        throw new java.lang.IllegalArgumentException("invalid round number");
    }
    final us.freeandfair.corla.model.Round round = the_cdb.rounds().get((the_round - 1));
    return us.freeandfair.corla.controller.ComparisonAuditController.computeBallotOrder(the_cdb, round.startAuditedPrefixLength(), round.expectedAuditedPrefixLength(), the_audited);
}