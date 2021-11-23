@org.springframework.scheduling.annotation.Scheduled(fixedRateString = "900000", initialDelay = 1000)
public void start() throws java.lang.Exception {
    if (!(stillRunnig)) {
        stillRunnig = true;
        logger.info(("start(), stillRunnig: " + (stillRunnig)));
        processMovieSearch();
        processMoviePoster(true);
        updateTop100Movies();
        logger.info(" end");
        stillRunnig = false;
    }
}