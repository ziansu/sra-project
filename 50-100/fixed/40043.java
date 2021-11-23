@org.junit.Test
public void testBuySell() throws java.lang.Exception {
    java.lang.String pFile = "analyze.local.properties";
    org.cld.stock.analyze.AnalyzeConf aconf = ((org.cld.stock.analyze.AnalyzeConf) (org.cld.taskmgr.TaskUtil.getTaskConf(pFile)));
    java.util.Date startDate = org.cld.stock.analyze.test.TestStock.msdf.parse("2015-05-01 10:00");
    java.util.Date endDate = org.cld.stock.analyze.test.TestStock.msdf.parse("2015-12-01 20:20");
    java.lang.String sn = "simpleone";
    org.cld.stock.analyze.AnalyzeBase.validateAllStrategyByStock(pFile, aconf, "nasdaq", startDate, endDate, sn, null, TradeHour.Normal);
}