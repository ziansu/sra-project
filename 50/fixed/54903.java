@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    loadAllValues();
    mFilterCalender.set(java.util.Calendar.DAY_OF_MONTH, mFilterCalender.get(java.util.Calendar.DAY_OF_MONTH));
}