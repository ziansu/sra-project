@java.lang.Override
public java.util.List<cz.mzk.recordmanager.server.oai.model.OAIRecord> read() {
    if (finished) {
        return null;
    }
    cz.mzk.recordmanager.server.oai.model.OAIListRecords listRecords = harvester.listRecords(resumptionToken);
    resumptionToken = listRecords.getNextResumptionToken();
    if ((resumptionToken) == null) {
        finished = true;
    }
    if (listRecords.getRecords().isEmpty()) {
        return null;
    }else {
        return listRecords.getRecords();
    }
}