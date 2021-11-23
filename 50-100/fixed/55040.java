private org.bedework.calfacade.BwCalendar embedClonedCollection(final org.bedework.webcommon.BwRequest request, final org.bedework.calfacade.BwCalendar col, final boolean fromCopy, final java.lang.String attrName) throws java.lang.Throwable {
    final org.bedework.webcommon.ColCloner cc = new org.bedework.webcommon.ColCloner(request.getClient(), request.getBwForm().getCalendarsOpenState());
    final org.bedework.calfacade.BwCalendar cloned;
    cloned = cc.deepClone(col, fromCopy);
    request.setSessionAttr(attrName, cloned);
    return cloned;
}