protected void deleteTempFiles() {
    final ru.yandex.qatools.embed.postgresql.config.AbstractPostgresConfig.Storage storage = getConfig().storage();
    if ((storage.dbDir()) == null) {
        return ;
    }
    if (!(storage.isTmpDir())) {
        return ;
    }
    if (!(de.flapdoodle.embed.process.io.file.Files.forceDelete(storage.dbDir()))) {
        ru.yandex.qatools.embed.postgresql.PostgresProcess.LOGGER.warn("Could not delete temp db dir: {}", storage.dbDir());
    }
}