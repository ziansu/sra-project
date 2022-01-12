public void saveAllChanges() {
    l("save all changes");
    if (model.isDrafting())
        model.setDrafting(false);
    
    db.update(model);
    deleteUnattachedChildren();
}