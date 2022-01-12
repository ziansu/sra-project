@java.lang.Override
public void onResponse(retrofit2.Call<no.dnt.sjekkut.pojo.CheckinsResult> call, retrofit2.Response<no.dnt.sjekkut.pojo.CheckinsResult> response) {
    stripPrivatePlaceCheckins(response.body().data);
    super.onResponse(call, response);
    removeCall(call);
    if (!(response.isSuccessful())) {
        no.dnt.sjekkut.Analytics.logServerError(getActivity(), response);
    }
}