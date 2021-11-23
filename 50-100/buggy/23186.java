private void proccessStatisticsByPaths(java.lang.String path, java.lang.String fileZip) throws ar.edu.tp.exception.TravelNotFoundException, java.io.IOException {
    this.startTime = java.lang.System.currentTimeMillis();
    ar.edu.tp.domain.parser.ParserZipDeamon parserZipDeamon = new ar.edu.tp.domain.parser.ParserZipDeamon(path);
    parserZipDeamon.parse();
    java.util.HashMap<ar.edu.tp.domain.Bike, ar.edu.tp.domain.parser.TimeAndQuantityBike> mapBike = parserZipDeamon.getMapBike();
    java.util.HashMap<ar.edu.tp.domain.Travel, java.lang.Integer> mapTravel = parserZipDeamon.getMapTravel();
    ar.edu.tp.domain.processor.StatisticalProcessor processor = new ar.edu.tp.domain.processor.StatisticalProcessor(mapBike, mapTravel);
    generateStatistics(processor, fileName);
}