public static boolean logoutUser() {
    if ((com.team19.gtmovies.data.CurrentState.getUser()) != null) {
        android.util.Log.println(Log.ASSERT, "GTMovies", ((com.team19.gtmovies.data.CurrentState.getUser().getUsername()) + " signed out."));
        com.team19.gtmovies.data.CurrentState.setUser(null);
        com.team19.gtmovies.data.IOActions.commit();
        return true;
    }
    return false;
}