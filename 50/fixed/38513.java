public void addController(IController controller) {
    controller.setMotionManager(_motionManager);
    controller.setSensorManager(_sensorManager);
    controller.init();
    _controller.add(controller);
}