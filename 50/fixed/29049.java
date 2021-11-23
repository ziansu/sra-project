@java.lang.Override
public void onSignalStrengthsChanged(android.telephony.SignalStrength signalStrength) {
    super.onSignalStrengthsChanged(signalStrength);
    statusView.setSignalStrength(signalStrength.getGsmSignalStrength());
}