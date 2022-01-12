@com.linkbit.beidou.controller.workOrder.RequestMapping(value = "/add2LocCart", method = RequestMethod.POST)
@com.linkbit.beidou.controller.workOrder.ResponseBody
public com.linkbit.beidou.domain.workOrder.WorkOrderReportCart add2LocCart(@com.linkbit.beidou.controller.workOrder.RequestParam(value = "locationId")
java.lang.Long locationId, @com.linkbit.beidou.controller.workOrder.RequestParam(value = "orderDesc")
java.lang.String orderDesc, @com.linkbit.beidou.controller.workOrder.RequestParam(value = "reporter")
java.lang.String reporter, @com.linkbit.beidou.controller.workOrder.RequestParam(value = "eqClassId")
java.lang.Long eqClassId, javax.servlet.http.HttpSession httpSession) {
    java.lang.String creator = ((java.lang.String) (httpSession.getAttribute("personName")));
    com.linkbit.beidou.domain.workOrder.WorkOrderReportCart workOrderReportCart = workOrderReportCartService.add2LocCart(locationId, orderDesc, creator, reporter, eqClassId);
    return workOrderReportCart;
}