public void onRequest(java.lang.String ipAddress, java.sql.Timestamp time) {
    synchronized(this) {
        (requestTotal)++;
    }
    com.hula.domain.Request request = new com.hula.domain.Request(ipAddress, 1, time);
    if (!(requests.contains(request))) {
        requests.add(request);
    }else {
        com.hula.domain.Request r = requests.get(requests.indexOf(request));
        r.setRequestCount(((r.getRequestCount()) + 1));
        r.setDateOfLastRequest(time);
    }
}