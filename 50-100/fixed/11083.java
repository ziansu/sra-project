public Common.Message toMessage() {
    Common.Message listMsg;
    java.lang.String content = "";
    int i = 0;
    for (Common.User item : this.usersList) {
        if (i == 0) {
            content = item.getUsername();
        }else {
            content = (content + " ") + (item.getUsername());
        }
        i++;
    }
    listMsg = new Common.Message(content, new Common.User("Server"), MessageType.DATA);
    return listMsg;
}