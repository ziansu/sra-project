@java.lang.Override
public void controlEvent(controlP5.ControlEvent theEvent) {
    super.controlEvent(theEvent);
    switch (theEvent.getName()) {
        case "shapeSelect" :
            this.shape.setShapeIndex(((int) (theEvent.getValue())));
            this.updateSliders();
            java.lang.System.out.println(theEvent.getValue());
            break;
        case "exitButton" :
            super.setIsRunning(false);
            this.module.menu.setIsRunning(true);
            this.module.menu.showOutsideButtons();
            break;
    }
}