@java.lang.Override
public int compare(com.getataxi.mobiletaxi.comm.models.OrderDM o1, com.getataxi.mobiletaxi.comm.models.OrderDM o2) {
    double val1 = (java.lang.Math.abs(((o1.orderLatitude) - (assignedTaxi.latitude)))) + (java.lang.Math.abs(((o1.orderLongitude) - (assignedTaxi.longitude))));
    double val2 = (java.lang.Math.abs(((o2.orderLatitude) - (assignedTaxi.latitude)))) + (java.lang.Math.abs(((o2.orderLongitude) - (assignedTaxi.longitude))));
    boolean result = val1 > val2;
    return result ? 1 : -1;
}