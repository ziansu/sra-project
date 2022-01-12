private joshie.harvest.api.calendar.Weather getRandomWeather(int day, joshie.harvest.api.calendar.Season season) {
    if (day > (joshie.harvest.api.calendar.CalendarDate.DAYS_PER_SEASON)) {
        season = getNextSeason(season);
    }
    joshie.harvest.api.calendar.Weather weather = CalendarAPI.INSTANCE.getDataForSeason(season).getWeather(joshie.harvest.calendar.data.CalendarServer.rand);
    return isWeatherEnabled(weather) ? weather : joshie.harvest.api.calendar.Weather.SUNNY;
}