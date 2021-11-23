public static void main(java.lang.String[] args) {
    java.lang.System.out.println("Welcome to the Dinner Decider!");
    java.lang.System.out.println("");
    java.util.List<dinnerdecider.Meal> dinnerList = dinnerdecider.DinnerDecider.createList();
    java.util.Set<java.lang.String> filterList = dinnerdecider.DinnerDecider.getFilterList(dinnerList);
    java.lang.System.out.println("");
    dinnerdecider.DinnerDecider.filter(dinnerList, filterList);
    dinnerdecider.DinnerDecider.formatNames(dinnerList);
    dinnerdecider.DinnerDecider.decide(dinnerList);
}