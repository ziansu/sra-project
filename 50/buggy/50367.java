public final boolean isCompleted() {
    return getCompletedDate().after(net.nikr.eve.jeveasset.data.settings.Settings.getNow());
}