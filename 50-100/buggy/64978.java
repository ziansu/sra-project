@org.springframework.web.bind.annotation.RequestMapping(value = "/")
java.lang.String index(@org.springframework.web.bind.annotation.RequestParam(value = "station", defaultValue = "", required = false)
java.lang.String station, @org.springframework.web.bind.annotation.RequestParam(value = "spot", defaultValue = "", required = false)
java.lang.Integer spot, org.springframework.ui.Model model) {
    log.error("index Action");
    java.util.List<com.taeschma.domain.StationRawData> findAllForToday = rawDataService.findAllForToday(station);
    java.util.List<com.taeschma.domain.CurrentStationWeather> currentStationWeatherList = com.taeschma.util.WeatherMapper.getCurrentStationWeather(findAllForToday);
    model.addAttribute("currentStationWeatherList", currentStationWeatherList);
    return "index";
}