@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    int weekday = 5;
    int weekend = 9;
    int optimalHours = 7 * 8;
    int actualHours = weekday * 5;
    actualHours = actualHours + (weekend * 2);
    int solution = optimalHours - actualHours;
    display(solution);
}