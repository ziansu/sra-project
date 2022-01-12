@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState != null) {
        java.util.HashMap<java.lang.String, java.util.ArrayList<android.graphics.Point>> data = ((java.util.HashMap<java.lang.String, java.util.ArrayList<android.graphics.Point>>) (savedInstanceState.getSerializable(pudding.com.cardio.GraphFragment.STATE_DATA)));
        this.splitData(data);
        this.updateCursor();
    }
}