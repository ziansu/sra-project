public java.awt.Point addBoxToThisLine(java.awt.Dimension box) {
    java.awt.Point point = new java.awt.Point(lineWidth, bottom);
    boxes.add(rectangleForBoxAt(box, point));
    lineWidth = +(box.width);
    lineHeight = java.lang.Math.max(lineHeight, box.height);
    return point;
}