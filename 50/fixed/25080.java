public void startInfoActivity(java.lang.String textToShow) {
    infoIntent.putExtra("qr_content", textToShow);
    startActivityForResult(infoIntent, 3);
}