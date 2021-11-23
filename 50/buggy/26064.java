public void checkNoImages(utils.Vector3f carrierPos) {
    if ((imgCounter) < (inputData.noImages.getValue())) {
        java.lang.System.out.println("taken");
        java.lang.System.out.println(carrierPos);
        takePicture();
    }else {
        moving = false;
        imgCounter = 0;
    }
}