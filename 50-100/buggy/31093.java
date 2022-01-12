private int displayRecommendationSelect(java.util.List<java.lang.String> theScale) {
    int choice = -1;
    int option = 1;
    displayScreenHeader("Select Recommendation Score");
    java.lang.System.out.println("Please enter a recommendation score below.");
    for (java.lang.String rec : theScale) {
        java.lang.System.out.println((((option++) + ") ") + rec));
    }
    choice = view.SystemHelper.promptUserInt();
    return choice;
}