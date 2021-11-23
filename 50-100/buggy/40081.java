public void readCredentials() {
    try {
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader("credentials.txt"));
        this.api_token = reader.readLine();
        this.user_id = reader.readLine();
    } catch (java.io.FileNotFoundException e) {
        java.lang.System.out.println("Please create file \'credentials.txt\' and add it your credentials.");
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}