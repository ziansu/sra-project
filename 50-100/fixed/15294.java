@org.springframework.web.bind.annotation.RequestMapping(value = { "/enterStock" })
public org.springframework.web.servlet.ModelAndView listEnterStock(com.fh.entity.Page page, @org.springframework.web.bind.annotation.RequestParam(value = "out", required = false)
boolean out) throws java.lang.Exception {
    org.springframework.web.servlet.ModelAndView mv = this.getModelAndView();
    com.fh.util.PageData pd = new com.fh.util.PageData();
    pd = this.getPageData();
    pd.put("Dept_ID", getDepId());
    java.util.List<com.fh.util.PageData> wareHousesList = clientsService.listAlLWareHouses(pd);
    mv.setViewName("warehouse/stock/stockList");
    mv.addObject("wareHousesList", wareHousesList);
    mv = getModel(mv, out);
    mv.addObject("pd", pd);
    return mv;
}