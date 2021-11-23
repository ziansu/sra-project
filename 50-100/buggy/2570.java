public void pickO1() {
    for (int i = 0; i < (mealsListSize); i++) {
        java.lang.System.out.println(((("\nOption " + (i + 1)) + " is ") + (mealsList[i])));
    }
    int meals = main.inputInt("\n\nEnter your option: ");
    main.input((("\nYou chose option " + meals) + " as your meal. Press <return> to continue"));
}