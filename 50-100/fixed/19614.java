private void calculateZerus() {
    factorX = (dimension.getWidth()) / ((maxX) - (minX));
    zerusX = ((-1) * (minX)) * (factorX);
    factorY = (dimension.getHeight()) / ((maxY) - (minY));
    zerusY = (maxY) * (factorY);
}