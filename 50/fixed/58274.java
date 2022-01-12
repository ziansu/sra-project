private void log(java.lang.String s) {
    android.util.Log.d(org.epfl.locationprivacy.privacyestimation.PrivacyEstimator.LOGTAG, s);
    org.epfl.locationprivacy.util.Utils.appendLog(((org.epfl.locationprivacy.privacyestimation.PrivacyEstimator.LOGTAG) + ".txt"), s, context);
}