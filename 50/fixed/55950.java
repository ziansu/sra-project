public static void loadInstance(java.lang.String encToken) {
    java.lang.String raw = com.mycompany.nncloudrestservice.utils.SafeHashUtil.getHash(encToken);
    com.mycompany.nncloudrestservice.daos.UserDAO udao = new com.mycompany.nncloudrestservice.daos.UserDAO(true);
    com.mycompany.nncloudrestservice.utils.CurrentUserContainer.instance = udao.getItem(raw);
}