public void modifyAngle(float delta) {
    angle = ((angle) + delta) % 360;
    shapes.get(0).setTransform(builder.scale(20).translate(0, 0, (-100)).rotateY(angle).build());
}