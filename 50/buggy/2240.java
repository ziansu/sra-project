public static void load(ai.grakn.engine.loader.Loader loader, ai.grakn.migration.base.Migrator migrator) {
    try {
        java.lang.System.out.println("about to migrate");
        migrator.migrate().forEach(loader::add);
    } finally {
        loader.waitToFinish();
    }
}