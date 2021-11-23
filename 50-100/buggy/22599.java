@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    android.os.Bundle bundle = data.getExtras();
    java.lang.String prep = bundle.getString("myData");
    UpdatePreparation(prep);
}