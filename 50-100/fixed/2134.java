@org.junit.Test
public void testSplittableAces() {
    if (com.mweser.Main.SPLITS_ENABLED) {
        com.mweser.Strategy.OptimalActions.ActionType expectedAction = OptimalActions.ActionType.SP;
        java.lang.String reasonString = "Result should be split";
        int dealerMin = 2;
        int dealerMax = 11;
        int playerMin = 2;
        int playerMax = 2;
        assertBlock(dealerMin, dealerMax, playerMin, playerMax, 1, expectedAction, reasonString, true);
    }
}