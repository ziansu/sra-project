public static void AcceptConnection(ProfNetwork esql, java.lang.String cur_usr, java.lang.String reqsender) {
    try {
        java.lang.String accept = java.lang.String.format("update connection_usr set status='Accept' where userid='%s' and connectionid='%s' and status='Request'", reqsender, cur_usr);
        esql.execute(accept);
        java.lang.System.out.println("Request Accepted Successfully");
    } catch (java.lang.Exception e) {
        java.lang.System.err.println(e.getMessage());
    }
}