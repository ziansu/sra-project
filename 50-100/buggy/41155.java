private java.lang.StringBuilder inputStreamToString(java.io.InputStream is) {
    java.lang.String rLine = "";
    java.lang.StringBuilder answer = new java.lang.StringBuilder();
    java.io.BufferedReader rd = new java.io.BufferedReader(new java.io.InputStreamReader(is));
    try {
        while ((rLine = rd.readLine()) != null) {
            answer.append(rLine);
        } 
    } catch (java.io.IOException e) {
        android.widget.Toast.makeText(con, ("Error..." + (e.toString())), Toast.LENGTH_LONG).show();
    }
    return answer;
}