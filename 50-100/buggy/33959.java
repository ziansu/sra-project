@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    java.lang.System.out.println(((requestCode + ", ") + resultCode));
    switch (requestCode) {
        case com.dangerducks.cookit.MainActivity.RECIPE_ACTIVITY :
            if (resultCode == (com.dangerducks.cookit.MainActivity.RECIPE_REMOVED)) {
            }else
                if (resultCode == (com.dangerducks.cookit.MainActivity.RECIPE_FAVED)) {
                    displayableRecipes = com.dangerducks.cookit.User.user().recipesSaved;
                    adapter.notifyDataSetChanged();
                }
            
            break;
    }
}