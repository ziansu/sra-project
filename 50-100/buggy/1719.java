public void returnResponse() {
    int c;
    try {
        for (int i = 0; i < (response.length()); i++) {
            output_s.write(response.charAt(i));
        }
        output_s.write(1);
    } catch (java.io.IOException e) {
        java.lang.System.err.println("IOException in reading Web server");
    }
}