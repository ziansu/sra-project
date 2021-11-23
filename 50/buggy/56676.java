@java.lang.Override
public void call(rxbus.ecaray.com.rxbuslib.rxbus.RxBusEvent rxBusType) {
    try {
        method.invoke(object, rxBusType.getObj()[0]);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}