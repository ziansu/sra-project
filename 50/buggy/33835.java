public void refreshListUI(java.util.List<com.example.administrator.leehom.model.MusicModel> modelList) {
    android.util.Log.i(com.example.administrator.leehom.fragment.MainFragment.TAG, ("refreshListUI modelList :" + modelList));
    if (com.example.administrator.leehom.utils.Utils.checkNull(mFragmentAdapter)) {
        mFragmentAdapter.updataRefresh(modelList);
    }
}