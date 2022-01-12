public void flipCameraType() {
    if (this.currentCamera.equals(this.perspectiveCamera)) {
        this.currentCamera = this.parallelCamera;
    }else {
        this.currentCamera = this.perspectiveCamera;
    }
    initialiseCamera();
}