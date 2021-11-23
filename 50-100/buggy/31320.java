@javax.annotation.Nonnull
protected hivemall.fm.FactorizationMachineModel initModel(@javax.annotation.Nullable
org.apache.commons.cli.CommandLine cl, @javax.annotation.Nonnull
hivemall.fm.FMHyperParameters params) throws org.apache.hadoop.hive.ql.exec.UDFArgumentException {
    if (params.parseFeatureAsInt) {
        if ((params.numFeatures) == (-1)) {
            return new hivemall.fm.FMIntFeatureMapModel(params);
        }else {
            return new hivemall.fm.FMArrayModel(params);
        }
    }else {
        return new hivemall.fm.FMStringFeatureMapModel(params);
    }
}