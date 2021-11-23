@java.lang.Override
public void init() throws javax.servlet.ServletException {
    javax.servlet.ServletContext context = getServletContext();
    presidentDAO = new data.PresidentDAOFileImpl(context);
    context.setAttribute("presidentDAO", presidentDAO);
}