void difficulty(android.view.View view) {
    android.net.Uri myUri = android.net.Uri.parse((((java.lang.String.valueOf(lives)) + " ") + (java.lang.String.valueOf(time))));
    android.content.Intent X = new android.content.Intent(this, com.example.dupriest.comp580_bam.difficulty.class);
    X.setData(myUri);
    startActivity(X);
}