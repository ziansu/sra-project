public int findCorrectPortion(java.util.ArrayList<java.lang.Integer> foods) {
    openCon();
    int portionID = -1;
    BusinessLogic.Food topSearch = pullFood("tesco", foods.get(1));
    java.lang.String foodCat1 = topSearch.getFoodCat();
    java.lang.String foodCat2 = topSearch.getFoodCat2();
    java.lang.String qu = "";
    openCon();
    int topPortionID = searchForID("portion_sizes", "Item", foodCat1).get(1);
    openCon();
    pullPortionSizes(topPortionID);
    return portionID;
}