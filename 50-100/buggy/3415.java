@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String mealType = "";
    switch (which) {
        case 0 :
            mealType = "Breakfast";
            break;
        case 1 :
            mealType = "Lunch";
            break;
        case 2 :
            mealType = "Dinner";
            break;
        case 3 :
            mealType = "Snack";
            break;
        default :
            mealType = "Error";
            break;
    }
    getMealItem(mealType);
}