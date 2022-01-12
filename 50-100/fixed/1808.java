@java.lang.Override
public void updateRepo() {
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(GitWatchContract.RepoEntry.COLUMN_LAST_COMMIT_MSG, me.adegokeobasa.gitwatch.fragments.RepoDetailFragment.commits.get(((me.adegokeobasa.gitwatch.fragments.RepoDetailFragment.commits.size()) - 1)).getTitle());
    if ((getActivity()) != null) {
        getActivity().getContentResolver().update(GitWatchContract.RepoEntry.buildRepoUri(repoId), contentValues, null, null);
    }
}