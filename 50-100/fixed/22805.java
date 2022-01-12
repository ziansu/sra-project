private void setRightPhotos() {
    if (leftOrRight) {
        slideview(linearlayou_left, 0, (-(getWidth)));
        eyeright_tv.setTextColor(getResources().getColor(R.color.font_color));
        eyeleft_tv.setTextColor(getResources().getColor(R.color.white));
    }
}