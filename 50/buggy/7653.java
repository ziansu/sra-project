@java.lang.Override
public void onSmrInvokedReceived(org.opendaylight.lispflowmapping.interfaces.lisp.SmrEvent event) {
    scheduler.smrReceived(event.getSubscriberAddressList());
}