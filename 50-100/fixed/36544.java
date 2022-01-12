@org.springframework.web.bind.annotation.RequestMapping(value = "/get")
public void get(@org.springframework.web.bind.annotation.RequestParam(value = "type")
java.lang.Integer getType, @org.springframework.web.bind.annotation.RequestParam(value = "arg")
java.lang.String arg, javax.servlet.http.HttpServletResponse response) {
    com.subang.bean.OrderDetail orderDetail = null;
    if (getType == (com.subang.util.WebConst.ORDER_GET_ID)) {
        java.lang.Integer orderid = java.lang.Integer.decode(arg);
        orderDetail = orderDao.getDetail(orderid);
    }else {
        java.lang.String barcode = arg;
        orderDetail = orderDao.getDetailByBarcode(barcode);
        if (orderDetail == null) {
            orderDetail = new com.subang.bean.OrderDetail();
        }
    }
    com.subang.util.SuUtil.outputJson(response, orderDetail);
}