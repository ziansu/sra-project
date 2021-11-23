@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    java.util.HashMap<java.lang.String, java.lang.Object> map = ((java.util.HashMap<java.lang.String, java.lang.Object>) (dataSnapshot.getValue()));
    com.example.phuong.viectimnguoiapp.utils.SharedPreferencesUtils.getInstance().setSetting(this, map.get("jobSetting").toString(), map.get("addressSetting").toString());
}