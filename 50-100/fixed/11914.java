@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    int prog = seekBar.getProgress();
    this.warmth = prog + 1;
    this.recapWarmth.setText(android.text.Html.fromHtml(((("<b>" + (res.getString(R.string.recapHot))) + "</b>") + (hotWordArray[prog]))));
}