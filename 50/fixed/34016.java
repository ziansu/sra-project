public void onClick(android.view.View v) {
    if ((cur_show_ad) != null) {
        cur_show_ad.hide();
        cur_show_ad = null;
    }
    finish();
}