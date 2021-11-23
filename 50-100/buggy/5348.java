public java.lang.String averageTime(java.lang.String year, java.lang.String raceCat) {
    long tmpSum = 0;
    int nbPart = 0;
    app.Race tmp = data.DataManager._instance.getYears().get(year).getRaces().get(raceCat);
    for (app.Results r : tmp.getParticipants().values()) {
        tmpSum += r.getTime();
        nbPart++;
    }
    tmpSum /= nbPart;
    return data.DataManager.formatTime(((int) (tmpSum)));
}