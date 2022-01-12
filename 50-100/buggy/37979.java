@java.lang.Override
public void onResponse(okhttp3.Call call, okhttp3.Response response) throws java.io.IOException {
    if (!(response.isSuccessful())) {
        onFailure(call, new java.io.EOFException(response.body().string()));
        return ;
    }
    if ((mTheater) == null) {
        try {
            mTheater = new mndev.ticketorder.Tickets.Theater(mndev.ticketorder.Utils.JsonUtils.toJsonObject(response.body().string()));
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }
}