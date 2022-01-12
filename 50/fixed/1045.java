public void initialData() {
    com.android.frankthirteen.timetracker.model.TrackerItem t1;
    t1 = new com.android.frankthirteen.timetracker.model.TrackerItem(getActivity());
    t1.setmTitle("ta ");
    com.android.frankthirteen.timetracker.model.TrackerItemLab.getsTrackerItemLab(getContext()).addTrackItem(t1);
}