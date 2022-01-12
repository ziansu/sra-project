protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.util.List<group3.po.MerchantInfo> merchantInfos = new java.util.ArrayList<group3.po.MerchantInfo>();
    merchantInfos = md.showAcceptedMerchants();
    for (group3.po.MerchantInfo merchantInfo : merchantInfos) {
    }
    request.setAttribute("merchantsInfos", merchantInfos);
    request.getRequestDispatcher("showMerchant.jsp").forward(request, response);
}