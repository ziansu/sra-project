@org.junit.Test
public void Set_WeightWatcherSmartPoints() {
    recipeModel.setWeightWatcherSmartPoints(12);
    org.junit.Assert.assertEquals(((int) (recipeModel.getWeightWatcherSmartPoints())), 12);
}