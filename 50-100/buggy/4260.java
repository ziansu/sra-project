@java.lang.Override
public void onItemClicked(@android.support.annotation.NonNull
java.lang.String uid, int selectedPosition) {
    if (!(com.dat.barnaulzoopark.BZApplication.isTabletLandscape(getContext()))) {
        com.dat.barnaulzoopark.ui.newsdetail.NewsDetailActivity.startActivity(getActivity(), uid);
    }else {
        if ((adapter.getSelectedPosition()) != selectedPosition) {
            this.selectedNewsPosition = selectedPosition;
            adapter.setSelectedPosition(selectedPosition);
            adapter.notifySelectedItem();
            showNewsDetail();
        }
    }
}