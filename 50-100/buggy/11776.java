@java.lang.Override
public void onResponse(retrofit2.Call<com.example.Dao.ListDao> call, retrofit2.Response<com.example.Dao.ListDao> response) {
    filterBeen.addAll(response.body().getDATA().getFilter());
    filterDialogVMs = new com.example.root.gitsecommerce.Main.ListFilter.FilterDialogVM(mContext, filterBeen);
    com.example.root.gitsecommerce.Main.ViewModel.MainActivityVM.mData.clear();
    com.example.root.gitsecommerce.Main.ViewModel.MainActivityVM.mData.addAll(response.body().getDATA().getProducts());
    com.example.root.gitsecommerce.Main.ViewModel.MainActivityVM.bAdapter.notifyDataSetChanged();
}