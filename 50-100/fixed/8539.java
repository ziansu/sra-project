public static void launchActivity(android.content.Context context, java.lang.String full_name, java.lang.String name, java.lang.String repo_url, java.lang.String login) {
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra(com.zpauly.githubapp.view.repositories.RepoContentActivity.FULL_NAME, full_name);
    intent.putExtra(com.zpauly.githubapp.view.repositories.RepoContentActivity.NAME, name);
    intent.putExtra(com.zpauly.githubapp.view.repositories.RepoContentActivity.REPO_URL, repo_url);
    intent.putExtra(com.zpauly.githubapp.view.repositories.RepoContentActivity.LOGIN, login);
    intent.setClass(context, com.zpauly.githubapp.view.repositories.RepoContentActivity.class);
    context.startActivity(intent);
}