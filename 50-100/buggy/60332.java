@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    prcInitRecyclerView();
    prcSetSwipeRefresh();
    if (com.gerus.themovie.utils.UNetwork.isOnline(mContext)) {
        prcWebGetGeners();
    }else {
        if (mListMiniatures.isEmpty())
            prcUpdateRecyclerView(mDB.getListTV(), false);
        
    }
}