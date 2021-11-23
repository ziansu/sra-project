@java.lang.Override
public void onFailure(retrofit2.Call<com.example.thanh.OnlinePharmacy.model.ResponseStatus> call, java.lang.Throwable t) {
    android.widget.Toast.makeText(getActivity(), ("Thất Bại " + (t.getMessage())), Toast.LENGTH_SHORT).show();
    android.util.Log.e("ERROR", ("" + (t.getMessage())));
}