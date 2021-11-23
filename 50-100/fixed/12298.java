@ita.o2o.controller.restful.ResponseBody
@ita.o2o.controller.restful.RequestMapping(value = "/reject")
public java.lang.String reject(java.lang.Integer orderId) {
    java.lang.System.out.println(("/reject orderId:" + orderId));
    ita.o2o.controller.restful.Order order = orderService.getOrderById(orderId);
    ita.o2o.entity.extra.Status status = statusService.getById(O2OConstants.STATUS_REJECTED);
    ita.o2o.util.bean.ResponseMessage responseMessage = new ita.o2o.util.bean.ResponseMessage();
    order.setStatus(status);
    if (orderService.updateOrder(order)) {
        responseMessage.setStatus(O2OConstants.SUCCESS);
    }else {
        responseMessage.setStatus(O2OConstants.FAILURE);
    }
    return jsonMapper.writeObjectAsString(responseMessage);
}