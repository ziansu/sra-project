public void effect() {
    minute = ((hu.elte.txtuml.examples.clock.model.signals.HandValue) (getSignal())).value;
    second = 0;
    if ((minute) > 0) {
        refresh();
    }
}