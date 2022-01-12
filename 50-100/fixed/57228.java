public void isOpen(boolean bOpen) {
    android.util.Log.e("下层窗帘回调", ("isOpen= " + bOpen));
    if (bOpen) {
        curtainTopView.openCurtain(10);
        promotionHeader.setVisibility(com.example.curtaineffect.view.VISIBLE);
        promotionHeader.setAlpha(1);
    }else {
        promotionHeader.setVisibility(com.example.curtaineffect.view.VISIBLE);
        promotionHeader.setAlpha(1);
    }
}