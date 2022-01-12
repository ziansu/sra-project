@java.lang.Override
public void onResponse(retrofit2.Call<dom.bom.com.tabatasdk.map_module.view.model.OfficeCallModel> call, retrofit2.Response<dom.bom.com.tabatasdk.map_module.view.model.OfficeCallModel> response) {
    android.util.Log.i(dom.bom.com.tabatasdk.map_module.view.map_fragment.FragmentPresenter.TAG, ("onResponse: " + (response.code())));
    if ((view) != null) {
        if (dom.bom.com.tabatasdk.rest.ResponseTaker.sendRequest(response, context, view)) {
            view.setListOfAddress(response.body().getAddressList());
        }else {
            view.onError(R.string.server_problem);
        }
    }
}