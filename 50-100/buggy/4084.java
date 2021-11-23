public boolean changeServingSize(int newValue) {
    if ((newValue >= (com.example.android.buddybuilding.Food.Food.MIN_SERVING_SIZE)) && (newValue <= (com.example.android.buddybuilding.Food.Food.MAX_SERVING_SIZE))) {
        float ratio = ((float) (newValue)) / ((float) (servingSize));
        changeProtein(((protein) * ratio));
        changeFat(((totalFat) * ratio));
        changeCarbs(((carbohydrates) * ratio));
        calculateCalories();
        servingSize = newValue;
        return true;
    }
    return false;
}