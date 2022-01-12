private void setLeftPhotos() {
    if (!(leftOrRight)) {
        slideview(linearlayou_left, 0, getWidth);
        eyeleft_tv.setTextColor(getResources().getColor(R.color.font_color));
        eyeright_tv.setTextColor(getResources().getColor(R.color.white));
    }
}