public void OnCreate(android.os.Bundle SavedInstanceState) {
    super.onCreate(SavedInstanceState);
    setContentView(R.layout.timesetter);
    done = ((android.widget.Button) (findViewById(R.id.okbtn)));
    clock = ((android.widget.TimePicker) (findViewById(R.id.timePicker)));
    done.setOnClickListener(buttonPresser);
}