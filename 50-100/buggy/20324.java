private void buildNewStage(java.lang.String stageName, java.lang.Integer difficulty, java.lang.Integer payload) {
    net.octopusstudios.carnospace.cmp.pojo.Stage s = new net.octopusstudios.carnospace.cmp.pojo.Stage(stageName, difficulty, payload);
    s.setMissionId(mission.getId());
    mission.addStageCost(s.getTotalCost());
    mission.getMissionStages().add(s);
    daoSession.insertOrReplace(s);
    daoSession.insertOrReplace(mission);
    stagesAdapter.notifyDataSetChanged();
}