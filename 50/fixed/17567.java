@java.lang.Override
public void handleResponse(com.myrecipebook.myrecipebook.Search.InfoDto response) {
    resultedRecipes = new java.util.ArrayList<>(response.resultRecipes);
}