@java.lang.Override
public void onEvent(graphics.layers.states.Event e) {
    super.onEvent(e);
    graphics.layers.states.EventDispatcher dispatcher = new graphics.layers.states.EventDispatcher(e);
    dispatcher.dispatch(Event.Type.MOUSE_PRESSED, new graphics.layers.states.EventHandler() {
        public boolean onEvent(graphics.layers.states.Event event) {
            return onMousePressed(((events.types.MousePressedEvent) (event)));
        }
    });
}