@java.lang.Override
public void success(java.lang.Object o, retrofit.client.Response response) {
    android.util.Log.d("Debug", "success");
    java.util.ArrayList<com.example.andrew.testapp.Models.RailModel> trainLocationList = ((java.util.ArrayList<com.example.andrew.testapp.Models.RailModel>) (o));
    addTrainLocationsToMap(trainLocationList);
}