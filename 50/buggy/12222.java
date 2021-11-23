public void changeMeal(int meals_wanted) {
    if (((-1) < meals_wanted) && (meals_wanted < 5))
        nrOfMeals = meals_wanted;
    else
        throw new java.lang.IllegalArgumentException("Error: The number of meals specified is not available. Please select a number between 0 and 4. ");
    
}