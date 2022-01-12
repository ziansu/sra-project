public static void load(ai.grakn.engine.loader.Loader loader, ai.grakn.migration.base.Migrator migrator) {
    try {
        migrator.migrate().forEach(loader::add);
    } finally {
        loader.waitToFinish();
    }
}