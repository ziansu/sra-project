public boolean removeStops(java.util.List<com.library.model.ClusteredStop> stoplist) {
    boolean response = false;
    for (com.library.model.ClusteredStop stop : stoplist) {
        response |= stops.remove(stop);
    }
    return response;
}