public java.lang.StringBuilder ingredientsPrinter() {
    java.lang.StringBuilder ingredientsPrinted = new java.lang.StringBuilder();
    for (int i = 0; i < (ingredients.size()); i++) {
        ingredientsPrinted.append(ingredients.get(i));
        if (i != ((ingredients.size()) - 1)) {
            ingredientsPrinted.append(", ");
        }
    }
    return ingredientsPrinted;
}