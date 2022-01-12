public final void loadCategories() {
    try {
        java.util.ArrayList<recipe.core.Category> categories = recipe.db.RecipeDB.getInstance().getCategories();
        javax.swing.DefaultListModel model = new javax.swing.DefaultListModel();
        for (recipe.core.Category c : categories) {
            java.lang.System.out.println(c.Name);
            model.addElement(c);
        }
        jList1.setModel(model);
    } catch (java.lang.Exception ex) {
        java.lang.System.err.println(ex.getMessage());
    }
}