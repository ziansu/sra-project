private void rotateCamera(boolean landscape) {
    if ((com.tetley.backgroundremover.view.CameraActivity.mCamera) == null)
        com.tetley.backgroundremover.view.CameraActivity.mCamera = com.tetley.backgroundremover.view.CameraActivity.getCameraInstance();
    
    if ((com.tetley.backgroundremover.view.CameraActivity.mCamera) == null) {
        return ;
    }
    com.tetley.backgroundremover.view.CameraActivity.mCamera.stopPreview();
    if (landscape) {
        isPortrait = false;
        com.tetley.backgroundremover.view.CameraActivity.mCamera.setDisplayOrientation(com.tetley.backgroundremover.view.CameraActivity.LANDSCAPE);
    }else {
        isPortrait = true;
        com.tetley.backgroundremover.view.CameraActivity.mCamera.setDisplayOrientation(com.tetley.backgroundremover.view.CameraActivity.PORTRAIT);
    }
    com.tetley.backgroundremover.view.CameraActivity.mCamera.startPreview();
    setupBoundaries();
}