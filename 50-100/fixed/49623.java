public void onCompleted(com.facebook.internal.ImageResponse response) {
    bitmap = response.getBitmap();
    android.widget.Toast.makeText(context, "Signed In", Toast.LENGTH_LONG).show();
    try {
        me.twango.twango.entity.User.setUser(context, object, NameConstant.LOGIN_TYPE_FACEBOOK, bitmap, com.facebook.internal.ImageRequest.getProfilePictureUri(object.getString("id"), 100, 100).toString());
        android.content.Intent getInfoActivity = new android.content.Intent(context, me.twango.twango.GetInfoActivity.class);
        startActivity(getInfoActivity);
    } catch (java.lang.Exception ex) {
    }
}