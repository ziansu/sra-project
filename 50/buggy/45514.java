@java.lang.Override
public void processMultiplyEvent() {
    this.model.setCurrentState("SAW_MULTIPLY");
    this.model.setMode("MULT");
    this.model.firstOrSecond(false);
}