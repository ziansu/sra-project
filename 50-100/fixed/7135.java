@org.springframework.web.bind.annotation.RequestMapping(value = "/storeProducts")
public org.springframework.web.servlet.ModelAndView listtabUsers(com.fh.entity.Page page, @org.springframework.web.bind.annotation.RequestParam(value = "out", required = false)
java.lang.String out) throws java.lang.Exception {
    org.springframework.web.servlet.ModelAndView mv = this.getModelAndView();
    com.fh.util.PageData pd = this.getPageData();
    pd.put("Dept_ID", getDepId());
    java.util.List<com.fh.util.PageData> productsList = clientsService.listStock(pd);
    mv.setViewName("warehouse/stock/stockpileList");
    mv.addObject("productsList", productsList);
    java.lang.System.out.println(("testlist:================" + (productsList.size())));
    mv.addObject("pd", pd);
    return mv;
}