public void resetUsed() {
    for (int i = 0; i < (team.size()); i++) {
        if (i == (frontIndex)) {
            team.get(i).getAttributes().setUsed(true);
        }else {
            team.get(i).getAttributes().setUsed(false);
        }
    }
}