@java.lang.Override
public void handle(javafx.scene.input.KeyEvent keyEvent) {
    switch (keyEvent.getCode()) {
        case ESCAPE :
            secondaryStage.close();
            closeSlideshow();
            break;
        case RIGHT :
            moveForwards();
            currentSlide = slideshow.getSlide(currentSlideNumber);
            buildCurrentSlide();
            break;
        case LEFT :
            moveBackwards();
            currentSlide = slideshow.getSlide(currentSlideNumber);
            buildCurrentSlide();
            break;
        default :
            break;
    }
}