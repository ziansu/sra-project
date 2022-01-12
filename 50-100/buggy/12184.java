@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_renshuu);
    kanaKey = ((android.widget.TextView) (findViewById(R.id.kanaKey)));
    chisaiIndicator = ((android.widget.TextView) (findViewById(R.id.chisaiIndicator)));
    userInput = ((android.widget.EditText) (findViewById(R.id.userInput)));
    userInput.setVisibility(EditText.INVISIBLE);
    chisaiIndicator.setVisibility(TextView.INVISIBLE);
    com.nihonkaeritai.flickrenshuu.repositories.KanaRepository.initialize(this);
    waitForTapToStart();
}