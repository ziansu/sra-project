public void isTeamCompeting() {
    int ctr = 0;
    for (code.Individual member : members) {
        if ((member.getIfCompeting()) == true) {
            ctr++;
        }
    }
    if (((member.size()) / 2) <= ctr) {
        teamCompeting = false;
    }else {
        teamCompeting = true;
    }
}