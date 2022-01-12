public static void parserInit() {
    AndroidModle.Parcelable.init(true);
    callconditiongraph.PreprocessingInnerClass.init(true);
    module.StubService.init(new java.lang.String[]{  }, false);
    util.TimeMeasurement.show("Stub Service Init");
    main.DataStructureInit.init();
    util.TimeMeasurement.show("Data Struture Init");
    module.CallConditionExtract.init(new java.lang.String[]{  }, false);
    util.TimeMeasurement.show("CallCondition Extract Init");
    new module.SecurityCheck().init(false);
    util.TimeMeasurement.show("Security Check Init");
}