public static int calcNumberSubStations(org.hwyl.sexytopo.model.survey.Station origin) {
    return (org.hwyl.sexytopo.model.survey.Survey.getAllStations(origin).size()) - 1;
}