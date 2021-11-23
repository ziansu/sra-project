void openCellWithAnimate(android.widget.ImageView imageView, int coordinate) {
    this.imageView = imageView;
    this.coordinate = coordinate;
    isFastAnimation = false;
    isMineAnimation = false;
    openCell(coordinate);
    imageView.startAnimation(shrink);
}