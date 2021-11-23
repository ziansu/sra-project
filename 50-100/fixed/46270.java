public final void loadCategories() {
    try {
        java.util.ArrayList<recipe.core.Category> categories = recipe.db.RecipeDB.getInstance().getCategories();
        javax.swing.DefaultListModel model = new javax.swing.DefaultListModel();
        for (recipe.core.Category c : categories) {
            model.addElement(c);
        }
        jList1.setModel(model);
    } catch (java.lang.Exception ex) {
        java.lang.System.err.println(ex.getMessage());
    }
}