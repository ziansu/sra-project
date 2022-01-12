private void buildNewStage(java.lang.String stageName, java.lang.String difficulty, java.lang.String payload) {
    int difficultyInt = java.lang.Integer.parseInt(difficulty);
    int payloadInt = java.lang.Integer.parseInt(payload);
    net.octopusstudios.carnospace.cmp.pojo.Stage s = new net.octopusstudios.carnospace.cmp.pojo.Stage(stageName, difficultyInt, payloadInt);
    s.setMissionId(mission.getId());
    mission.addStageCost(s.getTotalCost());
    mission.getMissionStages().add(s);
    daoSession.insertOrReplace(s);
    daoSession.insertOrReplace(mission);
    stagesAdapter.notifyDataSetChanged();
}