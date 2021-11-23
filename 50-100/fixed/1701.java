private void toStep(int index) {
    ch.epfl.planair.meta.PipelineConfig[] steps = PipelineConfig.Step.values();
    assert index < (steps.length);
    status = steps[index];
    rangeButton.min(config.lowerUnit(status));
    rangeButton.max(config.upperUnit(status));
    previousActionButton.text((index == 0 ? "Back" : "Previous"));
    nextActionButton.text(((index + 1) == (steps.length) ? "Finish" : "Next"));
}