private void addCoupleToSquare(short square, short coupleNo, short cplPsn) {
    com.bgt.core.CoupleGenerator tip = com.bgt.core.Globals.getInstance().getCoupleGenerator();
    tip.getCouplesInSquare().setCoupleNo(square, cplPsn, coupleNo);
    tip.getCouples().setSelectedForSquare(coupleNo, true);
}