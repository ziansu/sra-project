@java.lang.Override
public void onResponse(retrofit2.Call<java.util.ArrayList<execube.io.realmwithretrofit.model.Picture>> call, retrofit2.Response<java.util.ArrayList<execube.io.realmwithretrofit.model.Picture>> response) {
    if ((result.size()) == 0) {
        result = response.body();
        handleRV(result);
    }else {
        for (execube.io.realmwithretrofit.model.Picture picture : response.body()) {
            result.add(picture);
        }
        handleRV(result);
    }
}