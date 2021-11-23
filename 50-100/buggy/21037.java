public boolean hasMaxVolunteers(model.WorkLoad theWorkLoad) {
    switch (theWorkLoad) {
        case LIGHT :
            return (maxLightVolunteers) == (lightVolunteers.size());
        case MEDIUM :
            return (maxMediumVolunteers) == (mediumVolunteers.size());
        case DIFFICULT :
            return (maxDifficultVolunteers) == (difficultVolunteers.size());
    }
    return false;
}