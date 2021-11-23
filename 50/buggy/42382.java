@java.lang.Override
public processingModules.ProcessingModule clone() {
    processingModules.atomicModules.ConcentrationModule clone = new processingModules.atomicModules.ConcentrationModule();
    clone.concAsWeightPercent = this.concAsWeightPercent;
    clone.radius = this.radius;
    clone.elements.addAll(this.elements);
    return clone();
}