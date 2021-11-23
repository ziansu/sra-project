private void printItem(com.craftingguide.exporter.models.ItemModel item, com.craftingguide.util.Printer printer) throws java.io.IOException {
    printer.line(("item: " + (item.displayName)));
    printer.indent();
    if ((item.recipes.size()) > 0) {
        for (com.craftingguide.exporter.models.RecipeModel recipe : item.recipes) {
            this.printRecipe(recipe, printer);
        }
    }
    printer.outdent();
    printer.line();
}