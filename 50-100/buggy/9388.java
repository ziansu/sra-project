@java.lang.Override
public void onResponse(retrofit2.Call<dom.bom.com.tabatasdk.map_module.view.model.Track> call, retrofit2.Response<dom.bom.com.tabatasdk.map_module.view.model.Track> response) {
    if (dom.bom.com.tabatasdk.rest.ResponseTaker.sendRequest(response, context, view)) {
        view.setListOfParcel(getParcelList(response.body().getReceiver(), response.body().getSender()));
    }else {
        view.onError(R.string.server_problem);
    }
}