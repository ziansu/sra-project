@butterknife.OnItemClick(value = R.id.list_view)
void navigateData(int position) {
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString(Constants.SELECTED_DETAIL_VIEW_ID, mEntertainmentListModel.getEntertainmentModels().get(position).getId());
    bundle.putString(Constants.SELECTED_DETAIL_VIEW_FROM, com.xappie.fragments.EntertainmentFragment.TAG);
    bundle.putSerializable(Constants.SELECTED_MORE_TOPICS_LIST, com.xappie.utils.Utility.getMoreTopicsList(position, mEntertainmentListModel.getEntertainmentModels()));
    com.xappie.utils.Utility.navigateDashBoardFragment(new com.xappie.fragments.GalleryDetailViewFragment(), GalleryDetailViewFragment.TAG, bundle, mParent);
}