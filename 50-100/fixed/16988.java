@java.lang.Override
public com.idega.block.cal.data.CalendarEntryType findTypeByName(java.lang.String entryTypeName) {
    java.util.Collection<?> typesByName = findTypesByName(entryTypeName);
    if (!(com.idega.util.ListUtil.isEmpty(typesByName))) {
        for (java.lang.Object o : typesByName) {
            if (o instanceof com.idega.block.cal.data.CalendarEntryType) {
                return ((com.idega.block.cal.data.CalendarEntryType) (o));
            }
        }
    }
    return null;
}