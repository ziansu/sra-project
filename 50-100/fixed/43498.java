public void run() {
    while (true) {
        try {
            com.dianrong.common.uniauth.server.track.GlobalVar gv = GLOBALVAR_QUEUE.take();
            cacheAudit(constructAudit(gv));
            com.dianrong.common.uniauth.server.track.GlobalVar polgv = GLOBALVAR_QUEUE.poll();
            if (polgv == null) {
                setUpDBInsertRunnable();
            }else {
                cacheAudit(constructAudit(polgv));
            }
        } catch (java.lang.Exception e) {
            log.error("Take from GLOBALVAR_QUEUE error.", e);
        }
    } 
}