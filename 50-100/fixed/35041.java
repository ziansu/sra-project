public void run() {
    for (int i = ((admins.size()) - 1) / 2; i < (admins.size()); i++) {
        admins.get(i).restore();
    }
}