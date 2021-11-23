public void input() throws java.io.IOException {
    java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in));
    java.lang.System.out.println("Enter data");
    bno = java.lang.Integer.parseInt(br.readLine());
    phno = java.lang.Integer.parseInt(br.readLine());
    name = br.readLine();
    days = java.lang.Integer.parseInt(br.readLine());
}