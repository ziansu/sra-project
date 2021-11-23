@org.springframework.scheduling.annotation.Scheduled(fixedRate = 4000)
public void getRate() throws java.io.IOException {
    log.debug("Running scheduler");
    for (int i = 0; i < (this.dbsrpObjL.size()); i++) {
        log.info(((((("For 1 " + (io.xrates.constants.Currency.INR)) + " you get ") + (java.lang.String.valueOf(this.dbsrpObjL.get(i).convert(Currency.INR, Currency.SGD)))) + " ") + (io.xrates.constants.Currency.SGD)));
    }
}