@java.lang.Override
public void onResponse(retrofit2.Call<java.util.List<com.example.nejcvesel.pazikjehodis.retrofitAPI.Models.Path>> call, retrofit2.Response<java.util.List<com.example.nejcvesel.pazikjehodis.retrofitAPI.Models.Path>> response) {
    java.util.List<com.example.nejcvesel.pazikjehodis.retrofitAPI.Models.Path> paths = response.body();
    for (com.example.nejcvesel.pazikjehodis.retrofitAPI.Models.Path pth : paths) {
        myPathAdapter.addData(pth);
    }
    progressDialog.dismiss();
}