public void itemClicked() {
    fragmentNavigator.navigateTo(fragmentProvider.newStoreFragment(comment.getUser().getId(), "DEFAULT", StoreFragment.OpenType.GetHome));
}