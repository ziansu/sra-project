@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    marqueeTextView = ((com.potterhsu.marqueetextview.MarqueeTextView) (findViewById(R.id.tv)));
    marqueeTextView.setText("This is a good day, 歡迎光臨！");
    marqueeTextView.setColor(Color.BLUE);
    marqueeTextView.setSpeed(0.5F);
    marqueeTextView.start();
}