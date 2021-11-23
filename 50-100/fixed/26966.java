public void viewJobVolunteers() {
    int jobID = myUI.getJobID();
    if (!(checkPark(jobID))) {
        myUI.showJobIDError();
    }else {
        java.util.ArrayList<java.util.ArrayList<java.lang.String>> myVolunteerList = myPollster.getVolunteerList(jobID);
        myUI.displayVolunteers(myVolunteerList, myPollster);
    }
}