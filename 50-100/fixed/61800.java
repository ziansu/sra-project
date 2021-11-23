protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.util.List<com.pulppy.bean.MusicDTO> lstmusic = new java.util.ArrayList<com.pulppy.bean.MusicDTO>();
    com.pulppy.model.MusicDAO musicDAO = new com.pulppy.model.MusicDAO();
    try {
        lstmusic = musicDAO.getAllSong();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    request.setAttribute("musicList", lstmusic);
    javax.servlet.RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
    dispatcher.forward(request, response);
}