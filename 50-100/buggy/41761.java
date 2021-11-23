public double getOutputSpeed() throws GearTrain.Exceptions.GearTrainNonMeshableElements {
    double ratio = 1;
    GearTrain.Model.Gears.GearTrainElement p = null;
    for (GearTrain.Model.Gears.GearTrainElement g : gear_train) {
        ratio *= g.getRatio(p);
        p = g;
    }
    return ratio * (getInputSpeed());
}