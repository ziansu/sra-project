public static void main(java.lang.String[] args) {
    try {
        java.rmi.registry.Registry registry = java.rmi.registry.LocateRegistry.getRegistry("localhost", 1099);
        teoria4.MovieService movies = ((teoria4.MovieService) (registry.lookup("Movies")));
        teoria4.ClientHandle client1 = new teoria4.ClientHandleImpl();
        movies.subscribe(client1, "Drama");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}