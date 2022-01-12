@org.springframework.web.bind.annotation.RequestMapping(value = "/runSimulation")
@org.springframework.web.bind.annotation.ResponseBody
public void runSimulation(javax.servlet.http.HttpServletResponse httpServletResponse) throws java.io.IOException {
    executorService = java.util.concurrent.Executors.newFixedThreadPool(stationService.findAllStations().size());
    java.util.List<trainSimulator.models.Station> allStations = stationService.findAllStations();
    for (trainSimulator.models.Station station : allStations) {
        if ((station.getTrainsOnStation().size()) > 0) {
            java.lang.Runnable simulationWorker = new trainSimulator.controllers.SimulationService(trainService, generatorParametersService, stationService, eventLogService, station);
            executorService.execute(simulationWorker);
        }
    }
    httpServletResponse.sendRedirect("/adminPanel");
}