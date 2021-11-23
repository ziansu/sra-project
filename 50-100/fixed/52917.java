public com.androidsdk.snaphy.snaphyandroidsdk.list.DataList<com.androidsdk.snaphy.snaphyandroidsdk.models.Chat> getChats() {
    com.androidsdk.snaphy.snaphyandroidsdk.repository.ChatRepository chatRepository = ((com.androidsdk.snaphy.snaphyandroidsdk.repository.ChatRepository) (getRepository()));
    if (((that.getId()) != null) && ((chatRepository.getDb()) != null)) {
        chats = chatRepository.getDb().getAll__db("appUserId", that.getId().toString());
    }
    return chats;
}