@org.springframework.web.bind.annotation.RequestMapping(value = "/search-weather", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public com.trueweather.web.ThreeDaysWeatherController.Result getThreeDaysWeather(java.lang.String city) {
    if ((city == null) || (city.isEmpty())) {
        return new com.trueweather.web.ThreeDaysWeatherController.Result("Город не задан!");
    }
    return new com.trueweather.web.ThreeDaysWeatherController.Result(weatherService.getTrueWeatherOnThreeDays(city.toLowerCase()));
}