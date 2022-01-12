private void initBots() {
    this.fBot = new edu.calpoly.csc.scheduler.view.web.shared.Selenium.FirefoxDriver();
    this.login = new edu.calpoly.csc.scheduler.view.web.shared.Selenium.LoginSelectPage(fBot);
    this.toolbar = new edu.calpoly.csc.scheduler.view.web.shared.Selenium.Toolbar(fBot);
    this.instructors = new edu.calpoly.csc.scheduler.view.web.shared.Selenium.InstructorsPage(fBot);
    this.locations = new edu.calpoly.csc.scheduler.view.web.shared.Selenium.LocationsPage(fBot);
    this.courses = new edu.calpoly.csc.scheduler.view.web.shared.Selenium.CoursesPage(fBot);
}