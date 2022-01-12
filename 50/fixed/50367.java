public final boolean isCompleted() {
    return ((getCompletedDate()) != null) && (getCompletedDate().after(net.nikr.eve.jeveasset.data.settings.Settings.getNow()));
}