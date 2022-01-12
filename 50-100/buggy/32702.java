@java.lang.Override
public long getHeaderId(int position) {
    if (position == 0) {
        return 0;
    }
    org.septa.android.app.models.TripObject tripObject = ((org.septa.android.app.models.TripObject) (getItem(position)));
    if ((tripObject.getTrainViewModel()) != null) {
        return 2;
    }else {
        return 1;
    }
}