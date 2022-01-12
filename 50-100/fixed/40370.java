public static java.util.List<java.util.List<avia.androi.innopolis.com.aviasales.models.Flight>> buildListFlightsFromManySizeList(java.util.List<java.util.List<avia.androi.innopolis.com.aviasales.models.Flight>> array) {
    java.util.List<java.util.List<avia.androi.innopolis.com.aviasales.models.Flight>> listFlights = new java.util.ArrayList<>();
    if (array != null) {
        for (java.util.List<avia.androi.innopolis.com.aviasales.models.Flight> list : array) {
            if ((list.size()) > 1) {
                listFlights.add(list);
            }
        }
    }
    return listFlights;
}