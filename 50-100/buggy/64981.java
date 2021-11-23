public void deleteuser(int kuid) {
    for (int i = 0; i <= (userlist.size()); i++) {
        if ((userlist.get(i).getuid()) == kuid) {
            userlist.get(i).delete();
        }
    }
}