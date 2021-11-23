@java.lang.Override
protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    if (((request.getParameter("rewardId")) != null) && (!(request.getParameter("rewardId").equals("0")))) {
        ua.com.goit.gojava7.kickstarter.domain.Reward reward = rewardDAO.get(java.lang.Integer.valueOf(request.getParameter("rewardId")));
        request.setAttribute("amount", reward.getPledgeSum());
    }
    request.getRequestDispatcher("view/Payment.jsp").forward(request, response);
}