public int readChoise() {
    try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in))) {
        java.lang.System.out.println("Select a duck number from 1 to 5 : ");
        int duckNumber;
        duckNumber = java.lang.Integer.parseInt(reader.readLine());
        if ((duckNumber > (Task_02.DucksCasino.DUCKS_COUNT)) || (duckNumber < 0)) {
            java.lang.System.out.println("Error you entered the wrong number, please try again!");
            duckNumber = java.lang.Integer.parseInt(reader.readLine());
        }
        return duckNumber;
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return 0;
}