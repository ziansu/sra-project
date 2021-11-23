public boolean getMergeRefProject() {
    org.eclipse.jface.preference.IPreferenceStore preferenceStore = org.talend.core.model.repository.RepositoryManager.getRepositoryPreferenceStore();
    return preferenceStore.getBoolean(IRepositoryPrefConstants.MERGE_REFERENCE_PROJECT);
}