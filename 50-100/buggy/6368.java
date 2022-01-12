public void setMaxNumberOfTeams(java.util.Map<com.ngusta.cupassist.domain.Clazz, java.lang.Integer> maxNumberOfTeams) {
    android.util.Log.i(com.ngusta.cupassist.domain.Tournament.TAG, ((("Trying to set max number of teams: " + maxNumberOfTeams) + " Old clazzes: ") + (this.clazzes)));
    if (maxNumberOfTeams != null) {
        clazzes.clear();
        for (com.ngusta.cupassist.domain.Clazz clazz : maxNumberOfTeams.keySet()) {
            clazzes.add(new com.ngusta.cupassist.domain.Tournament.TournamentClazz(clazz, maxNumberOfTeams.get(clazz)));
        }
    }
}