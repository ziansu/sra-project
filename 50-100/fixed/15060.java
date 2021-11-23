public nl.fontys.pts61a.rra.controller.jsonfactory.Command getCommand(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    java.lang.String url = request.getServletPath();
    nl.fontys.pts61a.rra.controller.jsonfactory.Command c = this.commandList.get(url);
    if (c == null) {
        c = new nl.fontys.pts61a.rra.controller.jsonfactory.NotFound();
    }
    return c;
}