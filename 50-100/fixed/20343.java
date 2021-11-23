@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    this.view = ((com.squareup.timessquare.CalendarPickerView) (inflater.inflate(R.layout.dialogfragment_calendarpickerview, container, false)));
    this.view.init(this.minDate, this.maxDate).withSelectedDate(this.selectedDate).inMode(this.selectionMode);
    this.view.setOnDateSelectedListener(this);
    return this.view;
}