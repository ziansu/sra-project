public es.upm.miw.apaw.user.api.entities.Sport getSport() {
    if ((sports.size()) == 0)
        return null;
    
    return sports.pop();
}