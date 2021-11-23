public void remove(java.lang.String id, int linenumber) {
    java.util.Iterator<uk.chromis.pos.ticket.CouponLine> iterator = lines.iterator();
    while (iterator.hasNext()) {
        uk.chromis.pos.ticket.CouponLine line = iterator.next();
        if ((line.getid().contentEquals(id)) && ((line.getlinenumber()) == linenumber)) {
            lines.remove(line);
        }
    } 
}