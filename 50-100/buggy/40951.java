private be.rla.jtaken.pojos.OffDay getOff(java.util.Date date) {
    be.rla.jtaken.pojos.OffDay off = null;
    java.util.Iterator<be.rla.jtaken.pojos.OffDay> it = this.creche.getOffDays().iterator();
    while ((off == null) && (it.hasNext())) {
        be.rla.jtaken.pojos.OffDay offday = it.next();
        if (be.rla.jtaken.helpers.DateHelper.between(date, offday.getStartDate(), offday.getEndDate())) {
            off = offday;
        }
    } 
    return off;
}