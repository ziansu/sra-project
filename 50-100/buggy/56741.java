public void generateXML() throws java.io.IOException {
    java.net.URLConnection con = LocationURL.openConnection();
    java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(con.getInputStream()));
    java.lang.String inputLine;
    java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.FileWriter("location.xml"));
    while ((inputLine = in.readLine()) != null)
        writer.println(inputLine);
    
    writer.close();
    in.close();
}