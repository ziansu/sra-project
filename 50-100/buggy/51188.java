public RobertsHangar.Jet getLongestRange(RobertsHangar.Jet[] jets2) {
    int longRange = 0;
    RobertsHangar.Jet longestRangeJet = jets[0];
    for (RobertsHangar.Jet jet : jets) {
        if ((jet.getRange()) > longRange) {
            longRange = jet.getRange();
            longestRangeJet = jet;
        }
    }
    return longestRangeJet;
}