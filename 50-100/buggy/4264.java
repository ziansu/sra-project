public static void parserInit() {
    AndroidModle.Parcelable.init(false);
    callconditiongraph.PreprocessingInnerClass.init(false);
    module.StubService.init(new java.lang.String[]{  }, false);
    util.TimeMeasurement.show("Stub Service Init");
    main.DataStructureInit.init();
    util.TimeMeasurement.show("Data Struture Init");
    module.CallConditionExtract.init(new java.lang.String[]{  }, false);
    util.TimeMeasurement.show("CallCondition Extract Init");
    new module.SecurityCheck().init(false);
    util.TimeMeasurement.show("Security Check Init");
}