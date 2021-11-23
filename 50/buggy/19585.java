private void reportException(final java.lang.Exception exception) {
    java.lang.String message = "Es ist ein Problem aufgetreten, m\u00f6glicherweise wegen eines Programmierfehlers.\nBitte wende Dich an den IT-Ausschuss der SKGB.";
    message += "\n\n_______\n(Die folgenden Angaben k\u00f6nnen der Fehlersuche dienen.)\n\n" + (de.thaw.util.Debug.abbreviatedStackTrace(exception, de.skgb.offline.gui.Gui.myPackageLeader));
    reportException(exception, message);
}