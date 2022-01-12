public static void launchActivity(android.content.Context context, java.lang.String owner, java.lang.String repo, java.lang.String branch, java.lang.String url) {
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra(com.zpauly.githubapp.view.files.FilesActivity.REPO, repo);
    intent.putExtra(com.zpauly.githubapp.view.files.FilesActivity.OWNER, owner);
    intent.putExtra(com.zpauly.githubapp.view.files.FilesActivity.BRANCH, branch);
    intent.putExtra(com.zpauly.githubapp.view.files.FilesActivity.URL, url);
    intent.setClass(context, com.zpauly.githubapp.view.files.FilesActivity.class);
    context.startActivity(intent);
    ((android.app.Activity) (context)).finish();
}