@java.lang.Override
public void onCompleted(org.json.JSONObject object, com.facebook.GraphResponse response) {
    java.lang.System.out.println("aqui");
    refreshFacebookInformation();
    java.lang.System.out.println(object);
}