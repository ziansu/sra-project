public static synchronized void search(java.lang.String username, java.lang.String tu) {
    if (!(pset.three.Server.user_orders.containsKey(username))) {
        pset.three.Server.respond(tu, java.lang.String.format("No order found for %s", username));
        return ;
    }
    java.lang.String response = "";
    for (java.lang.String order : pset.three.Server.user_orders.get(username)) {
        response += java.lang.String.format("%s\n", order);
    }
    pset.three.Server.respond(tu, response);
}