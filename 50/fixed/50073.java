public static void main(java.lang.String[] args) {
    Database.DatabaseConnection.makeConnection();
    SimplifierResult data = Simplifier.simplifyWithData(new Equation("DERIV(TIMES(5, _x), _x)"), true);
}