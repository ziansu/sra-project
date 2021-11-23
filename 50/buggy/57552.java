@java.lang.Override
public int compareTo(com.xumpy.thuisadmin.model.db.Bedragen compBedrag) {
    java.lang.Long daysBetweenDate = (this.datum.getTime()) - (compBedrag.getDatum().getTime());
    return daysBetweenDate.intValue();
}