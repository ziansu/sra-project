public static void main(java.lang.String[] args) {
    foodfinder.data.TestData testData = new foodfinder.data.TestData();
    foodfinder.data.User user = testData.GetTestUser();
    java.util.List<foodfinder.data.Recipe> userHistory = testData.GetTestUserHistory();
    java.util.List<foodfinder.data.Ingredient> userIngredients = testData.GetTestUserIngredients();
    foodfinder.recommender.ItemBasedRecommender itRec = new foodfinder.recommender.ItemBasedRecommender(userIngredients);
    itRec.recommend(user, userHistory);
}