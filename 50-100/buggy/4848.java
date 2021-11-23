public void removeIngredientFromMyList(java.lang.String listName, java.lang.String ingredient) {
    myListIngredientsMap.get(listName).remove(ingredient);
    if (sharedPref.contains((listName + (conor.navigationdrawer.Database.MY_LIST_INGREDIENTS)))) {
        prefEditor.remove((listName + (conor.navigationdrawer.Database.MY_LIST_INGREDIENTS)));
    }
    prefEditor.putStringSet((listName + (conor.navigationdrawer.Database.MY_LIST_INGREDIENTS)), myListIngredientsMap.get((listName + (conor.navigationdrawer.Database.MY_LIST_INGREDIENTS))));
    prefEditor.commit();
}