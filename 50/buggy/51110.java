private pl.jaszczur.bots.aqi.state.JsonObject serializeStation(pl.jaszczur.bots.aqi.aqlogic.Station station) {
    return station == null ? null : pl.jaszczur.bots.aqi.state.Json.createObjectBuilder().add("id", station.getId()).add("name", station.getId()).build();
}