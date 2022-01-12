@java.lang.Override
public void onBackPressed() {
    android.content.Intent i = new android.content.Intent(this, com.fibonaccistudios.nathanlea.versebox.VersePicker.class);
    i.putExtra("bookIndex", bookIndex);
    i.putExtra("chapterNumber", chapterNumber);
    i.putExtra("startVerse", startVerse);
    i.putExtra("endVerse", endVerse);
    setResult(com.fibonaccistudios.nathanlea.versebox.RESULT_CANCELED, i);
    super.onBackPressed();
}