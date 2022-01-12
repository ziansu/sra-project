@java.lang.Override
public void onResponse(retrofit2.Call<com.example.thanh.OnlinePharmacy.model.ResponseStatus> call, retrofit2.Response<com.example.thanh.OnlinePharmacy.model.ResponseStatus> response) {
    android.widget.Toast.makeText(activity.getApplicationContext(), ((("Thành Công: " + (response.body().getStatus())) + "  ") + (response.body().getMessage())), Toast.LENGTH_SHORT).show();
    android.content.Intent intent = new android.content.Intent(getActivity(), com.example.thanh.OnlinePharmacy.view.pay.PayActivity.class);
    startActivity(intent);
    getActivity().finish();
}