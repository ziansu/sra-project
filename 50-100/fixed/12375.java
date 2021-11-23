private void CheckConcate(java.lang.String value1, java.lang.String value2) {
    if ((!(value2.equals("null"))) && (!(value2.equals("")))) {
        java.lang.String value = (("      " + value1) + ":  ") + value2;
        result_concate = ((result_concate) + value) + "\n";
    }
}