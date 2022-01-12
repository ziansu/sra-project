private java.util.List<java.lang.String> getPossibleChoices(com.brookmanholmes.billiards.turn.TurnEndOptions options, com.brookmanholmes.billiardmatchanalyzer.ui.addturnwizard.model.TurnBuilder turnBuilder) {
    java.util.List<java.lang.String> list = new java.util.ArrayList<>();
    if (options.lostGame) {
        list.add("Yes, lost game");
        list.add("Yes");
        if (options.possibleEndings.contains(TurnEnd.SAFETY))
            list.add("No");
        
    }else
        if (options.foul) {
            list.add("Yes");
        }else {
            list.add("Yes");
            list.add("No");
        }
    
    return list;
}