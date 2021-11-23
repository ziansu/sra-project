public void buttonDeleteOnClick(android.view.View v) {
    com.groupd.cookbook.business.AccessRecipe RAC = new com.groupd.cookbook.business.AccessRecipe();
    com.groupd.cookbook.objects.Recipe vRcy = RAC.getRecipe(title);
    com.groupd.cookbook.objects.Recipe result = RAC.deleteRecipe(vRcy);
    if (result == null) {
        android.content.Intent delete;
        delete = new android.content.Intent(this, com.groupd.cookbook.presentation.MainActivity.class);
        this.startActivity(delete);
    }
}