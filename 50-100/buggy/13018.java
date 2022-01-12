@android.support.annotation.NonNull
public static java.util.List<com.fastaccess.data.dao.FragmentPagerAdapterModel> buildForRepoIssue(@android.support.annotation.NonNull
android.content.Context context, @android.support.annotation.NonNull
java.lang.String login, @android.support.annotation.NonNull
java.lang.String repoId) {
    return com.annimon.stream.Stream.of(new com.fastaccess.data.dao.FragmentPagerAdapterModel(context.getString(R.string.opened), com.fastaccess.ui.modules.repos.issues.issue.RepoOpenedIssuesView.newInstance(repoId, login, IssueState.open)), new com.fastaccess.data.dao.FragmentPagerAdapterModel(context.getString(R.string.closed), com.fastaccess.ui.modules.repos.issues.issue.RepoClosedIssuesView.newInstance(repoId, login, IssueState.closed))).collect(com.annimon.stream.Collectors.toList());
}