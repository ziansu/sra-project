public void addPlayer(org.spongepowered.api.entity.living.player.User player) {
    if (playerExists(player))
        return ;
    
    me.flibio.jobslite.data.JobDataManipulatorBuilder builder = ((me.flibio.jobslite.data.JobDataManipulatorBuilder) (org.spongepowered.api.Sponge.getDataManager().getManipulatorBuilder(me.flibio.jobslite.data.JobData.class).get()));
    me.flibio.jobslite.data.JobData data = builder.setJobInfo("", 0, 0).create();
    java.lang.System.out.println(player.offer(data).isSuccessful());
}