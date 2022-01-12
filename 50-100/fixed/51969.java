@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    myview = new com.wiwi.android0303.PuzzleGame.MazeView(this);
    setContentView(R.layout.activity_main);
    android.widget.LinearLayout ll = ((android.widget.LinearLayout) (findViewById(R.id.mylinear)));
    ll.addView(myview);
}