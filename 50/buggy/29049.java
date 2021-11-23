@java.lang.Override
public void onSignalStrengthsChanged(android.telephony.SignalStrength signalStrength) {
    super.onSignalStrengthsChanged(signalStrength);
    statusView.setSignalStrength(((int) ((signalStrength.getGsmSignalStrength()) / 7.75)));
}