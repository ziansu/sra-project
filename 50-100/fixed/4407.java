@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/{stockId}/{date}")
@javax.ws.rs.Produces(value = "application/json")
public java.util.List<org.easystogu.db.vo.table.StockPriceVO> queryDayPriceByIdWithForecastPrice(@javax.ws.rs.PathParam(value = "stockId")
java.lang.String stockIdParm, @javax.ws.rs.PathParam(value = "date")
java.lang.String dateParm, java.lang.String postBody, @javax.ws.rs.core.Context
javax.servlet.http.HttpServletResponse response) {
    response.addHeader("Access-Control-Allow-Origin", accessControlAllowOrgin);
    java.util.List<org.easystogu.db.vo.table.StockPriceVO> rtnSpList = new java.util.ArrayList<org.easystogu.db.vo.table.StockPriceVO>();
    java.util.List<org.easystogu.db.vo.table.StockPriceVO> spList = postParmsProcess.updateStockPriceAccordingToRequest(stockIdParm, postBody);
    for (org.easystogu.db.vo.table.StockPriceVO vo : spList) {
        if (this.isStockDateSelected(postBody, dateParm, vo.date)) {
            rtnSpList.add(vo);
        }
    }
    return rtnSpList;
}