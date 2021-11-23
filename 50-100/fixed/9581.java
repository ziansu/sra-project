private void loadDataFromFile() {
    try {
        java.io.FileReader fr = new java.io.FileReader(new java.io.File("cities.txt"));
        java.io.BufferedReader br = new java.io.BufferedReader(fr);
        for (int i = 0; i < (RandomCities.NUMBER_OF_CITIES); i++) {
            cityList.add(br.readLine());
        }
        java.util.Collections.shuffle(cityList);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}