public static void main(java.lang.String[] args) {
    foodfinder.data.TestData testData = new foodfinder.data.TestData();
    foodfinder.data.User user = testData.GetTestUser();
    java.util.ArrayList<foodfinder.data.Recipe> userHistory = testData.GetTestUserHistory();
    java.util.ArrayList<foodfinder.data.Ingredient> userIngredients = testData.GetTestUserIngredients();
    foodfinder.recommender.ItemBasedRecommender itRec = new foodfinder.recommender.ItemBasedRecommender(userIngredients);
    itRec.recommend(user, userHistory);
}