public it.soprasteria.pianificazione.v2.bean.UserBean getUserFromUserPrincipal(java.lang.String userPrincipal) {
    it.soprasteria.pianificazione.v2.bean.UserBean userBean = dao.findByUsername(userPrincipal);
    if (userBean != null) {
        java.util.List<java.lang.String> buList = new java.util.ArrayList<>();
        java.lang.String divisione = userBean.getDivisione();
        java.lang.String[] tokens = divisione.split(",");
        for (java.lang.String token : tokens) {
            buList.addAll(dao.findBuByDivisione(token));
        }
        userBean.getBuList().addAll(buList);
    }
    return userBean;
}