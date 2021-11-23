@java.lang.Override
public void onFailure(retrofit2.Call<polyu.comp.funing.service.ShoppingCartR> call, java.lang.Throwable t) {
    android.util.Log.e(polyu.comp.funing.fragment.ShoppingCartF.TAG, ("failure:" + (t.toString())));
    polyu.comp.funing.fragment.ShoppingCartF.listview.hideProgress();
    polyu.comp.funing.fragment.ShoppingCartF.listview.hideMoreProgress();
    if ((getActivity()) == null) {
        return ;
    }
    java.util.List<polyu.comp.funing.model.ShoppingCartDetail> shoppingCartDetails = polyu.comp.funing.model.ScDbProcess.NewScDbProcess(getActivity()).scDbGetLocalScD();
    polyu.comp.funing.fragment.ShoppingCartF.scDetailAdapter.setMyList(shoppingCartDetails);
    polyu.comp.funing.fragment.ShoppingCartF.listview.setAdapter(polyu.comp.funing.fragment.ShoppingCartF.scDetailAdapter);
}