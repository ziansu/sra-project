public static tw.kewang.cwb.pretty.FutureWeatherByTown getFutureWeatherByTown(tw.kewang.cwb.Geocode geocode, float afterHours) {
    java.util.Date date = new java.util.Date(((java.lang.System.currentTimeMillis()) + ((long) ((tw.kewang.cwb.utils.Constants.ONE_HOUR) * afterHours))));
    tw.kewang.cwb.Cwb.LOG.debug("getFutureWeatherByTown: {}, {}", geocode.toString(), date.toString());
    return tw.kewang.cwb.Cwb.getFutureWeatherByTown(geocode, date);
}