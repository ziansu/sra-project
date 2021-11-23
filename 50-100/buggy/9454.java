public java.lang.String doshowValidateDetails() {
    initServletContextObject();
    com.tu.accountingview.model.GroupActVO groupactVO = new com.tu.accountingview.model.GroupActVO();
    int oneactId = java.lang.Integer.parseInt(request.getParameter("actId"));
    groupactVO = accountingviewBean.doGetAllValidateDetails(oneactId);
    request.setAttribute("act", groupactVO);
    request.setAttribute("actId", oneactId);
    return "ShowValidateDetails";
}