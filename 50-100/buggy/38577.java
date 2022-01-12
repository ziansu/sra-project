void checkSaveInstanceState(android.os.Bundle savedInstanceState) {
    if (savedInstanceState == null) {
        meetupListPresenter.fetchMeetupData(userZipCode);
    }else {
        if ((savedInstanceState.getParcelableArray(nyc.c4q.jordansmith.meetupeventbrowser.meetupList.MeetupListActivity.PARCELABLE_LIST_KEY)) == null) {
            meetupListPresenter.fetchMeetupData(userZipCode);
        }else {
            showProgressBar(false);
            java.util.ArrayList<android.os.Parcelable> parcelables = savedInstanceState.getParcelableArrayList(nyc.c4q.jordansmith.meetupeventbrowser.meetupList.MeetupListActivity.PARCELABLE_LIST_KEY);
            meetupListPresenter.convertParcelableToResults(parcelables);
        }
    }
}