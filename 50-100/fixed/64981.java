public void deleteuser(int kuid) {
    for (int i = 0; i <= ((userlist.size()) - 1); i++) {
        if ((userlist.get(i).getuid()) == kuid) {
            userlist.get(i).delete();
        }
    }
}