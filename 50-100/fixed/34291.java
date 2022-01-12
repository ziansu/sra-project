@java.lang.Override
public void pushBid(negotiator.Bid bid) {
    bids.add(bid);
    if ((bids.size()) < (MAX_NUM_BIDS)) {
        updateModel(bid);
        for (int n = 1; n <= (utilSpace.getNrOfEvaluators()); n++) {
            negotiator.utility.Evaluator evaluator = utilSpace.getEvaluator(n);
        }
    }
}