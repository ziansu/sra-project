@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.setContentView(R.layout.activity_line_circle_intersection);
    this.isLinePerpendicular = false;
    this.mode = ch.hgdev.toposuite.calculation.activities.linecircleintersection.LineCircleIntersectionActivity.Mode.LINE;
    this.point1SelectedPosition = 0;
    this.point2SelectedPosition = 0;
    this.mapViews();
    this.initViews();
}