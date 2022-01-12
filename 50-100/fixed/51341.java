@com.lennart.controller.RequestMapping(value = "/getBackdoorStraightCombos", method = RequestMethod.GET)
@com.lennart.controller.ResponseBody
public java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> getBackdoorStraightCombos() {
    new com.lennart.model.rangebuilder.RangeBuilder().getRange("aap", board, holeCards);
    new com.lennart.model.handevaluation.HandEvaluator().getHandStrength(holeCards, board);
    new com.lennart.model.boardevaluation.draws.HighCardDrawEvaluator().getMediumTwoOvercards(board);
    java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> temp = new java.util.HashMap<>();
    return temp;
}