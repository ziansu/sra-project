public name.martingeisse.trading_game.platform.postgres.PostgresContext getContext() {
    name.martingeisse.trading_game.platform.postgres.PostgresContext context = contexts.get();
    if (context == null) {
        context = new name.martingeisse.trading_game.platform.postgres.PostgresContext(postgresService);
    }
    return context;
}