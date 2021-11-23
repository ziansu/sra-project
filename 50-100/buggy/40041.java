public main.network.Connection<java.lang.String> acceptConnection(java.lang.String forKey) {
    java.lang.String source = main.util.Util.next(awaitingConnections.get(forKey));
    main.network.Connection<java.lang.String> connection = createConnection(forKey, source);
    if ((java.lang.Math.abs(getRateLimit(forKey, source))) < 1.0E-6)
        connection.close();
    
    return connection;
}