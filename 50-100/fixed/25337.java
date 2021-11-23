private net.aksingh.owmjapis.CurrentWeather getCurrentWeatherWithTimeout(net.aksingh.owmjapis.CurrentWeather currentWeather) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
    java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newCachedThreadPool();
    java.util.concurrent.Callable<net.aksingh.owmjapis.CurrentWeather> task = new java.util.concurrent.Callable<net.aksingh.owmjapis.CurrentWeather>() {
        public net.aksingh.owmjapis.CurrentWeather call() throws java.io.IOException, org.json.JSONException {
            return owmap.currentWeatherByCityName("Basel", "CH");
        }
    };
    java.util.concurrent.Future<net.aksingh.owmjapis.CurrentWeather> future = executor.submit(task);
    currentWeather = future.get(DataBaseManager.DataCollector.WEATHER_REQUEST_TIMEOUT, java.util.concurrent.TimeUnit.SECONDS);
    return currentWeather;
}