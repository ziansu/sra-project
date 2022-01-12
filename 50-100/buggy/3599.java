public boolean movePreference(model.Reader readerToAdd, model.Reader readerToRemoveFrom, model.Project projectToMove) {
    if (!(readerToAdd.getPreferences().contains(projectToMove))) {
        if (readerToAdd.addPreference(projectToMove)) {
            return true;
        }else {
            return false;
        }
    }else
        if (readerToAdd.equals(readerToRemoveFrom)) {
            readerToRemoveFrom.removePreference(projectToMove);
            readerToAdd.addPreference(projectToMove);
            return true;
        }else {
            return false;
        }
    
}