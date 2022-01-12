@java.lang.Override
public void onResponse(retrofit.Response<java.lang.Object> response) {
    textView.setText((((((response.body().toString()) + "|") + (response.message())) + "|") + (response.code())));
}