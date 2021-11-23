public void setYScale(double yScale) {
    super.setYScale(yScale);
    setHeight(((int) ((list.get(currentIndex).getHeight()) * yScale)));
}