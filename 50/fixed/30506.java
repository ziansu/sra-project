public void clockEdge() {
    if (new BinaryNum("0").equals(control.getValue())) {
        pcOut.setValue(pcIn.getValue());
    }
}