public static java.lang.String getActiviteId(java.lang.String activite) {
    try {
        java.lang.String response = com.unm.rodolphe.unnouveaumonde.Methods.sendPOST(new java.net.URL(((Constants.server_ADDRESS) + (Constants.activite_PHP))), "activite", "id, activite", "activite", activite);
        response = com.unm.rodolphe.unnouveaumonde.Methods.JSONtoStringID(response);
        return response;
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return "0";
    }
}