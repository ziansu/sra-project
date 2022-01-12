@java.lang.Override
public java.util.List<io.mapsquare.osmcontributor.model.utils.OpeningHours> fromValue(java.lang.String value) {
    if (value.trim().isEmpty()) {
        return null;
    }
    java.util.List<io.mapsquare.osmcontributor.model.utils.OpeningHours> openingHoursList = new java.util.ArrayList<>();
    java.lang.String[] openingHours = value.split(io.mapsquare.osmcontributor.ui.adapters.parser.OpeningHoursValueParser.HOURS_SEP);
    for (java.lang.String o : openingHours) {
        if (!(o.trim().isEmpty())) {
            openingHoursList.add(fromSingleValue(o));
        }
    }
    return openingHoursList;
}