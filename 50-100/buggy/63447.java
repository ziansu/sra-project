private com.joyent.manta.client.MantaJob buildJob() {
    java.util.List<com.joyent.manta.client.MantaJobPhase> phases = new java.util.ArrayList<>();
    com.joyent.manta.client.MantaJobPhase map = new com.joyent.manta.client.MantaJobPhase();
    map.setType("map");
    map.setExec("echo 'Hello World'");
    phases.add(map);
    java.lang.String name = java.lang.String.format("integration_test_%d", count.incrementAndGet());
    return new com.joyent.manta.client.MantaJob(name, phases);
}