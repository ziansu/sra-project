@java.lang.Override
public void onResponse(retrofit.Response<java.lang.String> response) {
    textView.setText((((((response.body()) + "|") + (response.message())) + "|") + (response.code())));
}