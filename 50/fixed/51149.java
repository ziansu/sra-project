public void register() {
    if ((icons) != null) {
        for (com.james.status.data.icon.IconData icon : icons) {
            icon.register();
        }
    }
}