@java.lang.Override
public void accept(@io.reactivex.annotations.NonNull
com.eternal.common.serial.BaseSerialMessage serialMessage) throws java.lang.Exception {
    android.databinding.ObservableField observableField;
    synchronized(callbackMap) {
        observableField = callbackMap.get(serialMessage.getClass());
    }
    if (observableField != null) {
        observableField.set(serialMessage);
    }
}