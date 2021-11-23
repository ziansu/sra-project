public void run() {
    com.zonas.dao.IPDao ipDao = new com.zonas.dao.IPDao();
    while (true) {
        try {
            com.zonas.entity.IP ip = ipDao.getIP();
            if (ip != null) {
                com.zonas.thread.PutIP.log.info(("Put  ====>" + (ip.toString())));
                ipQueue.putIP(ip);
            }
        } catch (java.lang.InterruptedException e) {
            com.zonas.thread.PutIP.log.info(e);
        }
    } 
}