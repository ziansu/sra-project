public void setSpriterScale(float scale) {
    super.setScale(scale, scale);
    dataVO.scale = scale;
    renew();
}