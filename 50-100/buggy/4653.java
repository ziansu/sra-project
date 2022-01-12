@java.lang.Override
public void responseCallBack(org.json.JSONObject response) {
    android.util.Log.e(com.example.qwerty.http.MeetupActivity.TAG, response.toString());
    try {
        meetupResponse = response;
        parsedDate = dateParser.parseResponseDate(response.getJSONObject("date"));
        usersFragment.passDataToFragment(response);
        if (displayData) {
            title.setText(response.getString("name"));
            desc.setText(response.getString("description"));
            dateTxt.setText(parsedDate);
        }
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}