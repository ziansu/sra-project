private static java.lang.String getMessageString(hu.bme.tmit.agile.logfilereader.model.TtcnEvent event) {
    return (((((("\"" + (event.getSender())) + "\" -> \"") + (((hu.bme.tmit.agile.logfilereader.model.Message) (event)).getDestination())) + "\" : ") + (event.getId())) + (((hu.bme.tmit.agile.logfilereader.model.Message) (event)).getName())) + "\n";
}