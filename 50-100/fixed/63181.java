@java.lang.Override
public void showView(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, java.lang.String viewName) {
    javax.servlet.RequestDispatcher view = request.getRequestDispatcher(viewName);
    try {
        view.forward(request, response);
    } catch (javax.servlet.ServletException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}