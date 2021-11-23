public void effect() {
    ++(currentValue);
    if ((currentValue) == (maxValue)) {
        currentValue = 0;
        hu.elte.txtuml.api.model.Action.send(port(hu.elte.txtuml.examples.clock.model.classes.Hand.OutTickPort.class).provided::reception, new hu.elte.txtuml.examples.clock.model.signals.Tick());
    }
    hu.elte.txtuml.api.model.Action.send(port(hu.elte.txtuml.examples.clock.model.classes.Hand.ValuePort.class).provided::reception, new hu.elte.txtuml.examples.clock.model.signals.HandValue(currentValue));
}