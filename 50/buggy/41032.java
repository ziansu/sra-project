public void xMinusClickListener(android.view.View view) {
    cubeRotationView.setXRotation(((cubeRotationView.getXRotation()) + (rotationStep)));
    cubeRotationView.invalidate();
}