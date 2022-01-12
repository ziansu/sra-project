protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    edu.iu.grid.oim.model.UserContext context = new edu.iu.grid.oim.model.UserContext(request);
    edu.iu.grid.oim.view.BootMenuView menuview = new edu.iu.grid.oim.view.BootMenuView(edu.iu.grid.oim.model.UserContext.getGuestContext(), "_error_");
    edu.iu.grid.oim.view.ContentView contentview = createContentView(context, request);
    edu.iu.grid.oim.view.BootPage page = new edu.iu.grid.oim.view.BootPage(edu.iu.grid.oim.model.UserContext.getGuestContext(), menuview, contentview, new edu.iu.grid.oim.view.SideContentView());
    page.render(response.getWriter());
}