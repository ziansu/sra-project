@java.lang.Override
public void onCraftMatrixChanged(com.alxnns1.mobhunter.container.IInventory inventoryIn) {
    reloadRecipes();
    java.lang.String log = "Recipes:\n";
    for (int i = 0; i < (recipes.size()); i++) {
        if (recipesValid.get(i))
            log += "Y - ";
        else
            log += "N - ";
        
        log += recipes.get(i).toString();
    }
    detectAndSendChanges();
}