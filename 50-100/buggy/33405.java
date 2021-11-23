@java.lang.Override
public java.util.List<org.jstrava.connector.Activity> getCurrentAthleteActivitiesAll() {
    int resultsPerPage = 30;
    int page = 1;
    java.util.List<org.jstrava.connector.Activity> currentActivities = new org.jstrava.connector.ArrayList<org.jstrava.connector.Activity>();
    java.util.List<org.jstrava.connector.Activity> activitiesPerPage;
    while (((activitiesPerPage = this.getCurrentAthleteActivities(page, resultsPerPage)).size()) > 0) {
        currentActivities.addAll(activitiesPerPage);
        page++;
    } 
    return currentActivities;
}