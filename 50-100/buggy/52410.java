@org.junit.BeforeClass
public static void setUpBeforeClass() throws java.lang.Exception {
    net.sf.memoranda.test.DefectListPullingFromFileTest.today = new net.sf.memoranda.date.CalendarDate().today();
    net.sf.memoranda.test.DefectListPullingFromFileTest.tomorrow = new net.sf.memoranda.date.CalendarDate().tomorrow();
    net.sf.memoranda.test.DefectListPullingFromFileTest.dayAfterTomorrow = new net.sf.memoranda.date.CalendarDate().tomorrow().tomorrow();
    net.sf.memoranda.test.DefectListPullingFromFileTest.fileStorage = new net.sf.memoranda.util.FileStorage();
    net.sf.memoranda.test.DefectListPullingFromFileTest.pulledFirstProject = net.sf.memoranda.ProjectManager.getProject("FirstTestProject");
    net.sf.memoranda.test.DefectListPullingFromFileTest.pulledFirstDefectList = net.sf.memoranda.test.DefectListPullingFromFileTest.fileStorage.openDefectList(net.sf.memoranda.test.DefectListPullingFromFileTest.pulledFirstProject);
    net.sf.memoranda.test.DefectListPullingFromFileTest.pulledSecondProject = net.sf.memoranda.ProjectManager.getProject("SecondTestProject");
    net.sf.memoranda.test.DefectListPullingFromFileTest.pulledSecondDefectList = net.sf.memoranda.test.DefectListPullingFromFileTest.fileStorage.openDefectList(net.sf.memoranda.test.DefectListPullingFromFileTest.pulledSecondProject);
}