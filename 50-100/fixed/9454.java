public java.lang.String doshowValidateDetails() {
    initServletContextObject();
    int oneactId = java.lang.Integer.parseInt(request.getParameter("actId"));
    com.tu.accountingview.model.GroupActVO groupactVO = accountingviewBean.doGetAllValidateDetails(oneactId);
    request.setAttribute("act", groupactVO);
    request.setAttribute("actId", oneactId);
    return "ShowValidateDetails";
}