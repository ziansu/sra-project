@java.lang.Override
public int compare(com.getataxi.mobiletaxi.comm.models.OrderDM o1, com.getataxi.mobiletaxi.comm.models.OrderDM o2) {
    double val1 = ((o1.orderLatitude) - (assignedTaxi.latitude)) + ((o1.orderLongitude) - (assignedTaxi.longitude));
    double val2 = ((o2.orderLatitude) - (assignedTaxi.latitude)) + ((o2.orderLongitude) - (assignedTaxi.longitude));
    boolean result = val1 < val2;
    return result ? 1 : -1;
}