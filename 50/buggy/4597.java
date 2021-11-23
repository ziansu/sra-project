@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends java.lang.Number> observable, java.lang.Number oldValue, java.lang.Number newValue) {
    if ((isFreeMutexLockSliderVolume) == true) {
        fixerVolumePosition(newValue.intValue());
    }
}