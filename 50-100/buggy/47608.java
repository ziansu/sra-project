public static void register(java.lang.String account, java.lang.String password, com.benio.mpost.interf.Response listener) {
    com.benio.mpost.bean.MUser user = new com.benio.mpost.bean.MUser();
    user.setUsername(account);
    user.setPassword(password);
    user.setName(account);
    user.setCanNotPost(false);
    user.signUp(com.benio.mpost.controller.MPostApi.getContext(), listener.save());
}