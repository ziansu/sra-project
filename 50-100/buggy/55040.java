private org.bedework.calfacade.BwCalendar embedClonedCollection(final org.bedework.webcommon.BwRequest request, final org.bedework.calfacade.BwCalendar col, final boolean fromCopy, final java.lang.String attrName) throws java.lang.Throwable {
    final org.bedework.webcommon.ColCloner cc = new org.bedework.webcommon.ColCloner(request.getClient(), request.getBwForm().getCalendarsOpenState());
    final org.bedework.calfacade.BwCalendar cloned;
    if (fromCopy) {
        cloned = cc.deepCloneCopy(col);
    }else {
        cloned = cc.deepClone(col);
    }
    request.setSessionAttr(attrName, cloned);
    return cloned;
}