@java.lang.Override
public void newReceiver(uk.ac.ucl.excites.sapelli.transmission.model.Correspondent newReceiver) {
    if (newReceiver != null)
        updateReceivers(true, newReceiver);
    
}