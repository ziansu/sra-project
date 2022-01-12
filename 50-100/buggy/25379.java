private void setFilterParams(javax.servlet.http.HttpServletRequest request, org.springframework.ui.Model model, java.lang.String path) {
    databaseData.setToSessionCarParams(request, model);
    pagination.getStartRow(request);
    request.getSession().setAttribute(by.pvt.controller.REQUEST_PAGE, path);
    model.addAttribute(by.pvt.controller.ORDER_DTO, new by.pvt.VO.OrderDTO());
    getCarsByDefaultFilter(request, model);
}