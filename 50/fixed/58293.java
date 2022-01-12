@org.junit.Before
public void setUp() throws java.io.IOException {
    scheduleCSV = new services.CSVHelper().getAbsolutePathOfResource("schedule.csv");
    loadedSchedule = services.CSVHelper.createScheduleFromCSV(scheduleCSV);
    homeController = new controllers.HomeController();
}