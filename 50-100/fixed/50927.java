@java.lang.Override
public void onResponse(retrofit2.Call<java.util.List<com.example.nejcvesel.pazikjehodis.retrofitAPI.Models.Location>> call, retrofit2.Response<java.util.List<com.example.nejcvesel.pazikjehodis.retrofitAPI.Models.Location>> response) {
    java.util.List<com.example.nejcvesel.pazikjehodis.retrofitAPI.Models.Location> locations = response.body();
    for (com.example.nejcvesel.pazikjehodis.retrofitAPI.Models.Location loc : locations) {
        java.lang.System.out.println(loc.getName());
        java.lang.System.out.println(loc.getId());
        myLocationAdapter.addData(loc);
    }
}