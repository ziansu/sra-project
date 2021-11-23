@java.lang.Override
public void remove(org.kurento.repository.RepositoryItem item) {
    httpManager.disposeHttpRepoItemElemByItemId(item, "Repository Item removed");
    gridFS.remove(item.getId());
}