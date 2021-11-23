@java.lang.Override
public void remove(org.kurento.repository.RepositoryItem item) {
    httpManager.disposeHttpRepoItemElemByItemId(item, "Repository Item removed");
    gridFS.remove(idQuery(item.getId()));
}