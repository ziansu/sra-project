private static void repair(amara.applications.master.client.launcher.network.backends.GameSelection gameSelection) {
    for (int i = 0; i < (gameSelection.getTeams().length); i++) {
        amara.applications.master.client.launcher.network.backends.GameSelectionPlayer[] team = gameSelection.getTeams()[i];
        if (((team.length) == 1) && ((team[0]) == null)) {
            gameSelection.getTeams()[i] = new amara.applications.master.client.launcher.network.backends.GameSelectionPlayer[0];
        }
    }
}