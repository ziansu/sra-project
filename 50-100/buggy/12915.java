private void addCoupleToSquare(short square, short coupleNo, short cplPsn) {
    com.bgt.core.CoupleGenerator tip = com.bgt.core.Globals.getInstance().getCoupleGenerator();
    java.lang.System.out.println(((((("in addCoupleToSquare, square = " + square) + ", couple = ") + coupleNo) + ", cplPsn = ") + cplPsn));
    tip.getCouplesInSquare().setCoupleNo(square, cplPsn, coupleNo);
    tip.getCouples().setSelectedForSquare(coupleNo, true);
}