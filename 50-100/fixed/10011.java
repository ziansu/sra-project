public void resetUsed() {
    for (int i = 0; i < (team.size()); i++) {
        team.get(i).getAttributes().setUsed((i == (frontIndex)));
    }
}