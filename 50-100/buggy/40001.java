private void setSessionUserPlantsList(javax.servlet.http.HttpSession session) {
    com.example.plantly.Domain.User user = ((com.example.plantly.Domain.User) (session.getAttribute("user")));
    java.util.List<com.example.plantly.Domain.UserPlant> userPlantList = DBConnection.getUserPlantsInfo(user.getUserId());
    if ((userPlantList.size()) > 0) {
        session.setAttribute("userPlantsList", userPlantList);
    }
}