@java.lang.Override
public int getItemViewType(int position) {
    if (position == 0) {
        com.louanimashaun.fattyzgrill.view.MealsAdapter.currentViewType = com.louanimashaun.fattyzgrill.view.MealsAdapter.CATEGORY_MEAL_ITEM;
        return com.louanimashaun.fattyzgrill.view.MealsAdapter.CATEGORY_MEAL_ITEM;
    }
    java.lang.String previousCategory = mMeals.get((position - 1)).getCategory();
    java.lang.String currentCategory = mMeals.get(position).getCategory();
    if (previousCategory.equals(currentCategory)) {
        com.louanimashaun.fattyzgrill.view.MealsAdapter.currentViewType = com.louanimashaun.fattyzgrill.view.MealsAdapter.MEAL_ITEM;
        return com.louanimashaun.fattyzgrill.view.MealsAdapter.currentViewType;
    }else {
        com.louanimashaun.fattyzgrill.view.MealsAdapter.currentViewType = com.louanimashaun.fattyzgrill.view.MealsAdapter.CATEGORY_MEAL_ITEM;
        return com.louanimashaun.fattyzgrill.view.MealsAdapter.currentViewType;
    }
}