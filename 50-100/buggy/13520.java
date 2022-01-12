@org.springframework.web.bind.annotation.RequestMapping(value = "statistic", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public top.jhechem.core.Response<java.util.List<top.jhechem.order.pojo.OrderStatistic>> getOrderStatistic(top.jhechem.order.pojo.OrderSearch search) {
    if ((search.getStart()) == null) {
        search.setStart(top.jhechem.core.util.DateUtil.getCurrentMonthStartSecond());
    }
    if ((search.getEnd()) == null) {
        search.setEnd(top.jhechem.core.util.DateUtil.getCurrentSecond());
    }
    if (cn.idongjia.util.Utils.isEmpty(search.getKrname())) {
        search.setKrname(null);
    }
    return top.jhechem.core.Response.ok(orderService.getOrderStatistic(search));
}