public static void removeMember(java.lang.String username) {
    username = username.toLowerCase();
    com.example.project.SessionManager.SessionManager.clients.remove(username);
}