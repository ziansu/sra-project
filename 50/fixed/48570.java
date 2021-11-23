public boolean getMergeRefProject() {
    org.eclipse.jface.preference.IPreferenceStore preferenceStore = org.talend.core.model.repository.RepositoryManager.getRepositoryPreferenceStore();
    if (!(preferenceStore.contains(IRepositoryPrefConstants.MERGE_REFERENCE_PROJECT))) {
        return false;
    }
    return preferenceStore.getBoolean(IRepositoryPrefConstants.MERGE_REFERENCE_PROJECT);
}