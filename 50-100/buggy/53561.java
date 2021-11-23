private void deletePicture(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, java.lang.String picID, java.lang.String username) throws java.io.IOException, javax.servlet.ServletException {
    uk.ac.dundee.computing.aec.instagrim.servlets.PicModel pm = new uk.ac.dundee.computing.aec.instagrim.servlets.PicModel();
    pm.setCluster(cluster);
    java.lang.System.out.println(("PictureID to delete: " + picID));
    pm.deletePicture(picID, username);
    java.lang.System.out.println("Picture deleted");
    response.sendRedirect(("/Instagrim/profile/" + (lg.getUsername())));
}