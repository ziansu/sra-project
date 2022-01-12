@java.lang.Override
public void onClick(android.view.View v) {
    currentArtist = edtextinput.getText().toString();
    displayartistinfo = false;
    fabsearch.setClickable(false);
    tweens.tweenfabback();
    if ((toolbar.getVisibility()) != (android.view.View.VISIBLE)) {
        tweens.tweenToolBarBack();
    }else {
        tweens.doSearchTweenIN();
    }
}