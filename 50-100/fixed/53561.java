private void deletePicture(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, java.lang.String picID, java.lang.String username, java.lang.String title) throws java.io.IOException, javax.servlet.ServletException {
    uk.ac.dundee.computing.aec.instagrim.servlets.PicModel pm = new uk.ac.dundee.computing.aec.instagrim.servlets.PicModel();
    pm.setCluster(cluster);
    java.lang.System.out.println(("PictureID to delete: " + picID));
    pm.deletePicture(picID, username, title);
    response.sendRedirect(("/Instagrim/profile/" + (lg.getUsername())));
}