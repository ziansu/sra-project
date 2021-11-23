public double add(com.liberymutual.goforcode.timeless.models.TimeEntries entry) {
    double sum = ((((((entry.getSunday()) + (entry.getMonday())) + (entry.getTuesday())) + (entry.getWednesday())) + (entry.getThursday())) + (entry.getFriday())) + (entry.getSaturday());
    return sum;
}