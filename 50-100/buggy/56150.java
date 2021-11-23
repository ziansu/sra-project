@java.lang.Override
public void remove() {
    deliveredCount.incrementAndGet();
    org.hornetq.core.paging.cursor.PagedReference delivery = currentDelivery;
    if (delivery != null) {
        org.hornetq.core.paging.cursor.impl.PageSubscriptionImpl.PageCursorInfo info = this.getPageInfo(currentDelivery.getPosition());
        if (info != null) {
            info.remove(currentDelivery.getPosition());
        }
    }
}