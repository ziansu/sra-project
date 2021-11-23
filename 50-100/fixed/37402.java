public void handleCurrentChatters(java.util.ArrayList<java.lang.String> users) {
    if ((users == null) || ((users.size()) == 0)) {
        return ;
    }
    for (com.afome.ChatBot.UserData user : this) {
        boolean found = false;
        for (java.lang.String chatter : users) {
            if (user.getUser().equalsIgnoreCase(chatter)) {
                user.joined();
                found = true;
                break;
            }
        }
        if (!found) {
            user.parted();
        }
    }
}