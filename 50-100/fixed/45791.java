@java.lang.Override
public void start() {
    sender = new driver.Sender(name, mode, outputAdapter, dataSourceAdapter, scheduler, lossRate);
    sender.start();
    if (mode.equals("feedback")) {
        receiver = new driver.Receiver(name, mode, feedbackAdapter, inputAdapter);
        receiver.start();
    }
}