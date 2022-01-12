public void educate(double[][] knowledges) {
    ua.kh.khpi.alex_babenko.art.Network.LOG.debug("Start network education");
    while (needNewEra()) {
        ua.kh.khpi.alex_babenko.art.Network.LOG.trace(("Need new era for education: " + (needNewEra())));
        startEra(knowledges);
        bCopy = arrayService.createCopy(b);
        tCopy = arrayService.createCopy(t);
    } 
    ua.kh.khpi.alex_babenko.art.Network.LOG.debug("Finish network education");
}