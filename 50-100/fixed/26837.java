@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    final android.view.View view = createView(parent);
    final adapters.RepositoryAdapter.GitHubRepoViewHolder viewHolder = ((adapters.RepositoryAdapter.GitHubRepoViewHolder) (view.getTag()));
    viewHolder.setGitHubRepo(getItem(position));
    return view;
}