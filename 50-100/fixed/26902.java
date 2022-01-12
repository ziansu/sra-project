public com.ufo.socketioandroiddemo.message.model.ChatModel getChatLast() {
    io.realm.Realm realm = io.realm.Realm.getDefaultInstance();
    io.realm.RealmResults<com.ufo.socketioandroiddemo.message.model.ChatBean> beans = realm.where(com.ufo.socketioandroiddemo.message.model.ChatBean.class).findAllSorted("Time", Sort.DESCENDING);
    if ((beans.size()) > 0) {
        com.ufo.socketioandroiddemo.message.model.ChatModel model = com.ufo.socketioandroiddemo.message.model.ChatModel.fromBean(beans.first());
        realm.close();
        return model;
    }
    realm.close();
    return null;
}