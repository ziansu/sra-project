@java.lang.Override
public void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.System.out.println("doPost enter user controller dopost!");
    java.lang.String requestURI = request.getRequestURI();
    java.lang.String url = null;
    java.lang.String userid = request.getParameter("userId");
    if (userExist(userid)) {
        url = "/study/displayStudyList";
    }else {
        request.getSession().invalidate();
        url = "/eqhome/login.jsp";
    }
    javax.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher(url);
    dispatcher.forward(request, response);
}