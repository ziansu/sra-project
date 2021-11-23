private void getParkingListFromApi() {
    android.util.Log.d("DEBUG", "getParkingListFromAPI EvacuationActivity");
    com.belspec.app.retrofit.RetrofitService retrofitService = com.belspec.app.retrofit.Api.createRetrofitService();
    com.belspec.app.interfaces.MyCallback<com.belspec.app.retrofit.model.getParkingList.response.GetParkingListResponseEnvelope> call = new com.belspec.app.interfaces.MyCallback();
    call.addResponseListener(this);
    retrofitService.executeGetParkingList(com.belspec.app.utils.Encode.getBasicAuthTemplate(com.belspec.app.utils.UserManager.getInstanse().getmLogin(), com.belspec.app.utils.UserManager.getInstanse().getmPassword()), new com.belspec.app.retrofit.model.getParkingList.request.GetParkingListRequestEnvelope()).enqueue(call);
}