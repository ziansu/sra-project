public void onAddModelFromAnnotator(semsim.reading.ModelAccessor accessor) {
    semgen.utilities.file.LoadSemSimModel loader = new semgen.utilities.file.LoadSemSimModel(accessor, false);
    loader.run();
    semsim.model.collection.SemSimModel semsimmodel = loader.getLoadedModel();
    if (semgen.utilities.SemGenError.showSemSimErrors()) {
        return ;
    }
    semgen.stage.stagetasks.ModelInfo info = new semgen.stage.stagetasks.ModelInfo(semsimmodel, accessor, _models.size());
    extractnodeworkbenchmap.add(new semgen.stage.stagetasks.extractor.ModelExtractionGroup(info));
    addModeltoTask(info);
    _commandSender.addModel(info.modelnode);
}