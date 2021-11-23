private boolean checkInput(java.lang.String[] queries) {
    return ((((queries[0].matches("^[A-Za-z]+")) && (queries[1].matches("^[A-Za-z]+"))) && (queries[2].matches("^(0[1-9]|1[0-9]|3[0-1])\\.(0[1-9]|1[0-2])\\.(19[0-9][0-9]|20[0-1][0-7])"))) && (queries[3].matches("^(0[1-9]|1[0-9]|3[0-1])\\.(0[1-9]|1[0-2])\\.(19[0-9][0-9]|20[0-9][0-9])"))) && (!(java.util.Objects.equals(queries[4], "")));
}