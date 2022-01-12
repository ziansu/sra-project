private void loadDataFromFile() {
    try (java.io.FileReader fr = new java.io.FileReader(new java.io.File("cities.txt"));java.io.BufferedReader br = new java.io.BufferedReader(fr)) {
        java.lang.String str;
        while (((str = br.readLine()) != null) && ((str.length()) > 0)) {
            cityList.add(str);
        } 
        java.util.Collections.shuffle(cityList);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}