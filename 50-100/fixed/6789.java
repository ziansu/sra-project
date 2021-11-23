@org.junit.Test
public void Inequals() {
    java.util.List<java.lang.String> collection = new java.util.ArrayList<java.lang.String>();
    collection.add("One");
    collection.add("Two");
    collection.add("Three");
    collection.add("Four");
    java.lang.String getAgenda = net.sf.memoranda.util.AgendaGenerator.getAgenda(net.sf.memoranda.date.CalendarDate.yesterday(), collection);
    net.sf.memoranda.date.CalendarDate cd = net.sf.memoranda.date.CalendarDate.tomorrow();
    assertTrue(net.sf.memoranda.util.AgendaGenerator.getAgenda(cd, collection).equals(getAgenda));
}