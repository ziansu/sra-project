private static final mediathek.config.Daten getInstance(mediathek.MediathekGui aMediathekGui) {
    return (mediathek.config.Daten.instance) == null ? new mediathek.config.Daten(aMediathekGui) : mediathek.config.Daten.instance;
}