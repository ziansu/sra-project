@java.lang.Override
public void responseCallBack(org.json.JSONObject response) {
    try {
        meetupResponse = response;
        parsedDate = dateParser.parseResponseDate(response.getJSONObject("date"));
        if (displayData) {
            title.setText(response.getString("name"));
            desc.setText(response.getString("description"));
            dateTxt.setText(parsedDate);
        }
        usersFragment.passDataToFragment(response);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}