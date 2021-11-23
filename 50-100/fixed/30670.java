protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String idSelect = request.getParameter("id");
    com.pulppy.model.MusicSinglePlay singplay = new com.pulppy.model.MusicSinglePlay();
    java.util.List<com.pulppy.bean.MusicDTO> lstmusic = new java.util.ArrayList<com.pulppy.bean.MusicDTO>();
    lstmusic = singplay.getSingleSong(idSelect);
    request.setAttribute("musicList", lstmusic);
    javax.servlet.RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/page/SingelSong.jsp");
    dispatcher.forward(request, response);
}