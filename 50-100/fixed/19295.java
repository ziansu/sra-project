private void unfadeTour(com.uni_wuppertal.iad.vierteltour.utility.xml.Tour tour) {
    polylines.get(tour.slug()).color(android.graphics.Color.parseColor(tour.color()));
    for (com.uni_wuppertal.iad.vierteltour.utility.xml.Station station : tour.stations()) {
        markers.get(station.slug()).alpha(1.0F);
    }
}