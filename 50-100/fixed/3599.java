public boolean movePreference(model.Reader readerToAdd, model.Reader readerToRemoveFrom, model.Project projectToMove) {
    if (!(readerToAdd.getPreferences().contains(projectToMove))) {
        readerToRemoveFrom.removePreference(projectToMove);
        readerToAdd.addPreference(projectToMove);
        return true;
    }else
        if (readerToAdd.equals(readerToRemoveFrom)) {
            readerToRemoveFrom.removePreference(projectToMove);
            readerToAdd.addPreference(projectToMove);
            return true;
        }else {
            return false;
        }
    
}