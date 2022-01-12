public void exchange() {
    int result = ((circuit.getWaterelement(circuit.getPointerA()).getTemperature()) + (reactor.getTemperature())) / 2;
    reactor.setTemperature(result);
    circuit.getWaterelement(circuit.getPointerB()).setTemperature(result);
    mc.onReactorTempChange(result);
}