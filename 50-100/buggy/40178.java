@java.lang.Override
public void onResponse(retrofit2.Call<com.paulvarry.intra42.api.model.Messages> call, retrofit2.Response<com.paulvarry.intra42.api.model.Messages> response) {
    if (response.isSuccessful())
        android.widget.Toast.makeText(getContext(), "Success\nDon\'t forget to refresh", Toast.LENGTH_SHORT).show();
    else
        android.widget.Toast.makeText(getContext(), (("Error: " + (response.message())) + "\nDon\'t forget to refresh"), Toast.LENGTH_SHORT).show();
    
}