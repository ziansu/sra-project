@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == 9001) {
        if (resultCode == (RESULT_OK)) {
            int vegId = data.getIntExtra("vegId", 0);
            java.lang.String kookPlaatID = data.getStringExtra("kookPlaatID");
            android.util.Log.v(com.tomdoesburg.kooktijden.MainActivity.TAG, (kookPlaatID + " was selected"));
            setVegetable(vegId, kookPlaatID);
        }
    }
}