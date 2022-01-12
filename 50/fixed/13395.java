@java.lang.Override
public java.util.ArrayList<org.helioviewer.jhv.data.datatype.event.JHVEvent> backgroundWork() {
    return org.helioviewer.jhv.database.EventDatabase.getOtherRelations(event.getUniqueID(), event.getJHVEventType(), false, true);
}