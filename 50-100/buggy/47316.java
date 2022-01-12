private iteration1.Match[] assignTeamsToHosts(iteration1.School[] hosts, iteration1.School[] participants, int numHosts) {
    iteration1.Match[] matches = new iteration1.Match[numHosts];
    for (int i = 0; i < numHosts; i++) {
        matches[i].host = hosts[i];
    }
    for (iteration1.School school : participants) {
        sortMatchesByProximity(school, matches)[0].schools.add(school);
    }
    return matches;
}