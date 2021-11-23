protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.util.List<po.MerchantProfile> mp = md.loadAllMerchantProfile(0);
    request.setAttribute("merchant", mp);
    java.lang.System.out.println(mp.size());
    request.getRequestDispatcher("viewMerchant.jsp").forward(request, response);
}