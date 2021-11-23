private void getUserInfos() {
    android.content.SharedPreferences infos = getSharedPreferences("userInfos", 0);
    emailFromRegister = infos.getString("userEmail", "empty");
    passFromRegister = infos.getString("userPass", "empty");
    android.widget.Toast.makeText(this, ("Email given " + (emailFromRegister)), Toast.LENGTH_SHORT).show();
    android.widget.Toast.makeText(this, ("Pass given " + (passFromRegister)), Toast.LENGTH_SHORT).show();
}