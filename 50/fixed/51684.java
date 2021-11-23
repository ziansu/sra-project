@java.lang.Override
public void stop(int trainID) {
    send(new modelrailway.util.Event.SpeedChanged(trainID, 0.0F));
}