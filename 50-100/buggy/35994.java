public static java.lang.String prompt(java.lang.String prompt, java.lang.Object... args) {
    java.lang.String str = "";
    java.lang.System.out.printf(prompt, args);
    try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in))) {
        str = reader.readLine();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return str;
}