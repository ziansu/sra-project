@org.springframework.web.bind.annotation.RequestMapping(value = "/message/detail", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public com.dianping.rotate.shop.model.ServiceResult getProcessMessage(@org.springframework.web.bind.annotation.RequestParam(value = "source", defaultValue = "0")
int source, @org.springframework.web.bind.annotation.RequestParam(value = "type", defaultValue = "0")
int type, @org.springframework.web.bind.annotation.RequestParam(value = "status", defaultValue = "0")
int status, @org.springframework.web.bind.annotation.RequestParam(value = "pageIndex", defaultValue = "1")
int pageIndex, @org.springframework.web.bind.annotation.RequestParam(value = "pageSize", defaultValue = "10")
int pageSize) {
    com.dianping.rotate.shop.model.StatisticsModel statisticsModel = statisticsService.getProcessMessage(source, type, status, pageSize, (pageSize * (pageIndex - 1)));
    com.dianping.rotate.shop.model.ServiceResult result = new com.dianping.rotate.shop.model.ServiceResult();
    result.setCode(ServiceResult.SUCCESS);
    result.setMsg(statisticsModel);
    return result;
}