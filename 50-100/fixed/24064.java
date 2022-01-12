@java.lang.Override
public java.lang.String[] getFileLines(java.lang.String path) {
    try (java.io.BufferedReader reader = getReader(path)) {
        java.util.ArrayList<java.lang.String> data = new java.util.ArrayList<>();
        java.lang.String temp;
        while ((temp = reader.readLine()) != null) {
            data.add(temp);
        } 
        return data.toArray(new java.lang.String[data.size()]);
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return new java.lang.String[0];
    }
}