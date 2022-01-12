public static void main(java.lang.String[] args) {
    io.proxylabs.spawning_pool.App.retrieveConfig();
    io.proxylabs.spawning_pool.App.dbService = io.proxylabs.spawning_pool.database.DbService.getInstance(io.proxylabs.spawning_pool.App.properties);
    io.proxylabs.spawning_pool.App.httpService = io.proxylabs.spawning_pool.http.HttpService.getInstance(io.proxylabs.spawning_pool.App.properties);
    io.proxylabs.spawning_pool.App.initUnitGenerator();
}