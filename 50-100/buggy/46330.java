public void birdCamera(int view) {
    switch (view) {
        case 1 :
            operations.CreateCamera.camera.setTranslateX(483.0);
            operations.CreateCamera.camera.setTranslateY((-836.0));
            operations.CreateCamera.camera.setTranslateZ(1050);
            operations.CreateCamera.camera.getTransforms().add(rVertD);
            break;
        case 2 :
            operations.CreateCamera.camera.setTranslateX(483.0);
            operations.CreateCamera.camera.setTranslateY((-36.0));
            operations.CreateCamera.camera.setTranslateZ(0.0);
            operations.CreateCamera.camera.getTransforms().add(rVertLVL);
            break;
        case 3 :
            break;
    }
}