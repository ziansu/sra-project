@java.lang.Override
public java.lang.String getServiceName() {
    java.lang.String sName = (this.getClass().getName()) + "{ ";
    for (de.pentasys.SilverPen.service.TimeService srv : childTimeService) {
        sName += (srv.getServiceName()) + ",";
    }
    sName += "} ";
    return sName;
}