@java.lang.Override
public void onNext(final org.apache.reef.io.network.Message<java.lang.String> message) {
    final java.util.Iterator<java.lang.String> iter = message.getData().iterator();
    while (iter.hasNext()) {
        java.lang.System.out.println(("Message: " + (iter.next())));
    } 
}