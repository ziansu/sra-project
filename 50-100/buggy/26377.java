@java.lang.Override
public void onSelect(java.lang.String name) {
    if (name.equals("Save")) {
        if (view.isValid()) {
            com.duggan.workflow.shared.model.catalog.Catalog cat = view.getCatalog();
            save(cat);
            hide();
        }
    }else {
        hide();
    }
}