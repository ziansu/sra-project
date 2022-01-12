public void setNext() {
    if ((this.instruction) != null) {
        this.decode.setInstruction(this.instruction, mar.getValue());
        this.instruction = null;
    }
}