@java.lang.Override
public void onTaskSuccess() {
    switchTab(repoID, repo.getName(), repo.getRootDirID());
}