@java.lang.Override
public void exitTitratingChange(antlr.prescription.PrescriptionParser.TitratingChangeContext ctx) {
    java.lang.System.out.println(("exitTitratingChange() -> " + (ctx.getText())));
    java.lang.System.out.println(this.tempDose);
    this.tempChangeDose = this.tempDose;
    this.tempChangeDose.setAmount(((this.tempChangeDose.getAmount()) * (this.tempTitratingDirection)));
}