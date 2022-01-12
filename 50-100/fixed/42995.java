public java.lang.String stopMonitor() {
    com.ymt.testplatform.entity.MonitorItem item = monitorService.findMonitorItemById(currentItemId);
    item.setEndTime(new java.util.Date());
    monitorService.saveMonitorItem(item);
    ret.put("retCode", "1000");
    ret.put("retMSG", "关闭监控项成功");
    return "success";
}