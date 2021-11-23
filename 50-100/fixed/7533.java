public void selectCategory(com.sammyer.yahtzee.RollCategory category, com.sammyer.yahtzee.DiceRoll dice) {
    totalScore += getPointsScored(category, dice);
    if ((category == (RollTypes.yahtzee)) && (category.matches(dice)))
        hasYahtzee = true;
    
    if (isNumberRoll(category))
        numberRollScore += category.getPointsScored(dice);
    
    categoriesLeft.remove(category);
    curStrategy = new com.sammyer.yahtzee.RollStrategy(database, categoriesLeft);
}