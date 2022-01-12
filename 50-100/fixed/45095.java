@java.lang.Override
public void onFavorite(twitter4j.User source, twitter4j.User target, twitter4j.Status favoritedStatus) {
    super.onFavorite(source, target, favoritedStatus);
    if (twitterUtil.MyUserStreamAdapter.screenName.equals(target.getScreenName())) {
        javafx.application.Platform.runLater(() -> {
            manager.DialogManager.getSingleton().createDialog(favoritedStatus, source, "favorite");
        });
    }
}