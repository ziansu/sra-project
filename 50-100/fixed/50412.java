@java.lang.Override
public void exitTitratingChange(antlr.prescription.PrescriptionParser.TitratingChangeContext ctx) {
    java.lang.System.out.println(("exitTitratingChange() -> " + (ctx.getText())));
    this.tempChangeDose = this.tempDose;
    this.tempChangeDose.setAmount(((this.tempChangeDose.getAmount()) * (this.tempTitratingDirection)));
}