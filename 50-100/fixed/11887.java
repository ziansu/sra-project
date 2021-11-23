private void next() {
    update();
    int next = (status.ordinal()) + 1;
    if (next >= (PipelineConfig.Step.values().length)) {
        ch.epfl.planair.Planair.become(ch.epfl.planair.mods.MenuMode.class);
    }else {
        toStep(next);
    }
}