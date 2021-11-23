@java.lang.Override
protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws java.io.IOException, javax.servlet.ServletException {
    req.setAttribute(com.dmmsoft.ConstantsProvider.FUND_COUNT, container.getMainContainer().getCurrenciesCount());
    req.setAttribute(com.dmmsoft.ConstantsProvider.CURRENCY_COUNT, container.getMainContainer().getFundsCount());
    req.setAttribute(com.dmmsoft.ConstantsProvider.ALL_INVESTMENTS, container.getMainContainer().getInvestments());
    req.getRequestDispatcher("../userview/investments.jsp").forward(req, resp);
}