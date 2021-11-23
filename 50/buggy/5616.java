public void push(final org.copinf.cc.controller.AbstractController controller) {
    controllers.peek().end();
    controllers.push(controller);
    setController(controller);
}