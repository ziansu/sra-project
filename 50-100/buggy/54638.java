@java.lang.Override
public void onResponse(retrofit2.Call<java.lang.Integer> call, retrofit2.Response<java.lang.Integer> response) {
    int version = response.body();
    if (((response.code()) == 200) && (version > currVersion)) {
        updateData(dataUpdater, version);
    }else {
    }
}