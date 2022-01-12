public static boolean logoutUser() {
    android.util.Log.println(Log.ASSERT, "GTMovies", ((com.team19.gtmovies.data.CurrentState.getUser().getUsername()) + " signed out."));
    com.team19.gtmovies.data.CurrentState.setUser(new com.team19.gtmovies.pojo.User());
    com.team19.gtmovies.data.IOActions.commit();
    return true;
}