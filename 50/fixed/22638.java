private static com.ringov.notekeeper.model.BaseModel getInstance(com.ringov.notekeeper.view.interfaces.ContextProvider contextProvider) {
    if ((com.ringov.notekeeper.model.ModelManager.model) != null) {
        return com.ringov.notekeeper.model.ModelManager.model;
    }else {
        com.ringov.notekeeper.model.ModelManager.model = new com.ringov.notekeeper.model.BaseModel(contextProvider);
        return com.ringov.notekeeper.model.ModelManager.model;
    }
}