public void eatFoods(org.json.JSONArray e) {
    for (java.lang.Object foodEaten : e)
        foods.remove(((java.lang.Integer) (foodEaten)));
    
}