private void mayTriggerRefresh(org.eclipse.jgit.events.RepositoryEvent e) {
    repositoriesChanged.add(e.getRepository());
    if ((!(org.eclipse.egit.ui.Activator.getDefault().getPreferenceStore().getBoolean(UIPreferences.REFESH_ONLY_WHEN_ACTIVE))) || (org.eclipse.egit.ui.Activator.isActive()))
        triggerRefresh();
    
}