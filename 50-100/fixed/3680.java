void bind(android.content.Context context, local.imoroz.gitviewer.model.RepoModel model, boolean fav) {
    repoName.setText(model.getName());
    repoDescription.setText(model.getDescription());
    if (fav) {
        repoItemFavImage.setBackground(android.support.v4.content.ContextCompat.getDrawable(context, R.drawable.ic_star_black_24dp));
    }else {
        repoItemFavImage.setBackground(null);
    }
}