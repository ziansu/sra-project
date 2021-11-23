public void startParticleEffects() {
    if ((runner) != null) {
        runner.cancel();
    }
    org.spongepowered.api.scheduler.Scheduler scheduler = org.spongepowered.api.Sponge.getScheduler();
    org.spongepowered.api.scheduler.Task.Builder taskBuilder = scheduler.createTaskBuilder();
    runner = taskBuilder.execute(this::particleRunner).intervalTicks(1).submit(plugin);
}