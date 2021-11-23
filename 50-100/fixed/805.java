private void removeNotificatoinsOf(org.eclipse.californium.core.observe.ObserveRelation relation) {
    org.eclipse.californium.core.network.Matcher.LOGGER.fine("Remove all remaining NON-notifications of observe relation");
    for (java.util.Iterator<org.eclipse.californium.core.coap.Response> iterator = relation.getNotificationIterator(); iterator.hasNext();) {
        org.eclipse.californium.core.coap.Response previous = iterator.next();
        org.eclipse.californium.core.network.Exchange.KeyMID idByMID = new org.eclipse.californium.core.network.Exchange.KeyMID(previous.getMID(), null, 0);
        exchangesByMID.remove(idByMID);
        iterator.remove();
    }
}