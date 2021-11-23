@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    view = ((com.example.robin.test.NineMensMorrisView) (findViewById(R.id.nineMensMorrisView)));
    game = new com.example.robin.controller.NineMensMorrisGame(view, ((android.widget.TextView) (findViewById(R.id.textView))));
}