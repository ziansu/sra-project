@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    it.jaschke.alexandria.zxing.IntentResult scanningResult = it.jaschke.alexandria.zxing.IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
    if (scanningResult != null) {
        java.lang.String contents = scanningResult.getContents();
        it.jaschke.alexandria.AddBook fragment = it.jaschke.alexandria.AddBook.newInstance(contents);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commitAllowingStateLoss();
    }else {
        android.widget.Toast.makeText(this, "No scan data received!", Toast.LENGTH_SHORT).show();
    }
}