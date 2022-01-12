@java.lang.Override
public void onSuccess(int i, cz.msebera.android.httpclient.Header[] headers, byte[] reponseBody) {
    userS.setAvatar(android.graphics.BitmapFactory.decodeByteArray(reponseBody, 0, reponseBody.length));
    if ((is_finish[0]) == ((userSearch.size()) / 3)) {
        completeTextView.setAdapter(new com.example.thanhvu.adsfacebook.model.UserSearchAdaper(getContext(), R.id.list_view_status, userSearch));
        completeTextView.showDropDown();
    }
    (is_finish[0])++;
}