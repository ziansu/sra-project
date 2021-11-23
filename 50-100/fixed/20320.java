@java.lang.Override
protected java.lang.String aggregateResult(java.util.List<edu.fudan.se.bean.WorkerResponse> responses) {
    if ((responses.size()) == 0) {
        return null;
    }
    edu.fudan.se.bean.WorkerResponse wr = responses.get(0);
    for (edu.fudan.se.bean.WorkerResponse response : responses) {
        if (wr.date.before(response.date)) {
            wr = response;
        }
        acceptWorkerResponseId(response.id);
    }
    return wr.responseString;
}