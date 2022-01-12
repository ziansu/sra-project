@java.lang.Override
public void addRemainder(long date, int repeater, iso.piotrowski.marek.nyndro.Model.PracticeModel practice) {
    iso.piotrowski.marek.nyndro.GoogleAnalytics.Analytics.logPracticeEvent(Analytics.TypeOfEvent.AddRemainder.toString(), practice.getName(), (((iso.piotrowski.marek.nyndro.tools.Utility.getStringDate(date)) + ", ") + (practice.getString())));
    iso.piotrowski.marek.nyndro.DataSource.DBQuery.addReminders(date, repeater, practice);
}