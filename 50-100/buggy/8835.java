private com.smanzana.dungeonmaster.utils.StepList toStepList() {
    com.smanzana.dungeonmaster.utils.StepList out = new com.smanzana.dungeonmaster.utils.StepList();
    for (com.smanzana.dungeonmaster.ui.app.swing.editors.StepField.RangeSegment seg : segments) {
        if (seg != null)
            out.addStep(seg.getMax(), seg.getValue());
        
    }
    return out;
}