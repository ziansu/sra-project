@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "/heartBeat", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public model.BaseStatus receiveHeartBeat(javax.servlet.http.HttpServletRequest request) {
    java.lang.String ip = getRemoteHost(request);
    logger.info(("heartbeat from " + ip));
    if (!(db.WorkerCache.contains(ip))) {
        sync.FilterConfigSync.syncFilterConfigsToWorker();
    }
    db.WorkerCache.putIp(ip);
    return model.BaseStatus.buildSuccessBaseStatus();
}