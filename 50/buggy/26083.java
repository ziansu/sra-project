public lu.fisch.structorizer.elements.Element copy() {
    lu.fisch.structorizer.elements.Element ele = new lu.fisch.structorizer.elements.Call(this.getText().copy());
    return copyDetails(ele, true);
}