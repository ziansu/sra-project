public void assertStatement(int numSoftAces, boolean isSplittable, int hardSum, int dealerCardValue, com.mweser.Strategy.OptimalActions.ActionType expectedAction, java.lang.String reasonString) {
    boolean hasSoftAce;
    if (numSoftAces == 0) {
        hasSoftAce = false;
    }else {
        hasSoftAce = true;
        hardSum++;
    }
    com.mweser.Strategy.OptimalActions.ActionType resultAction = com.mweser.Strategy.OptimalActions.getBestAction(hardSum, dealerCardValue, hasSoftAce, isSplittable);
    org.hamcrest.MatcherAssert.assertThat(reasonString, (resultAction == expectedAction));
}