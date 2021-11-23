private void getImageFromApi(java.lang.String docId, int index) {
    com.belspec.app.retrofit.RetrofitService retrofitService = com.belspec.app.retrofit.Api.createRetrofitService();
    com.belspec.app.interfaces.MyCallback<com.belspec.app.retrofit.model.getItemImage.response.GetItemImageResponseEnvelope> call = new com.belspec.app.interfaces.MyCallback();
    call.addResponseListener(this);
    retrofitService.executeGetItemImage(com.belspec.app.utils.Encode.getBasicAuthTemplate(com.belspec.app.utils.UserManager.getInstanse().getmLogin(), com.belspec.app.utils.UserManager.getInstanse().getmPassword()), new com.belspec.app.retrofit.model.getItemImage.request.GetItemImageRequestEnvelope(docId, index)).enqueue(call);
}