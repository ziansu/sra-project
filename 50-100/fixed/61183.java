@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    switch (position) {
        case 0 :
            mDateWindow = com.jamessimshaw.eventmanager.datasources.EventDataSource.TODAY;
            break;
        case 1 :
            mDateWindow = com.jamessimshaw.eventmanager.datasources.EventDataSource.SEVEN_DAYS;
            break;
        case 2 :
            mDateWindow = com.jamessimshaw.eventmanager.datasources.EventDataSource.THIRTY_DAYS;
            break;
        case 3 :
            mDateWindow = com.jamessimshaw.eventmanager.datasources.EventDataSource.ALL_FUTURE;
            break;
        default :
            mDateWindow = com.jamessimshaw.eventmanager.datasources.EventDataSource.ALL_FUTURE;
    }
    displayEvents();
}