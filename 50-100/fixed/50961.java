@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.recordingspeakers);
    safeActivityTransition = false;
    safeActivityTransitionMessage = "This will discard the selected speakers";
    okButton = ((android.widget.ImageButton) (findViewById(R.id.recordingSpeakerOkButton)));
    okButton.setImageResource(R.drawable.ok_disabled_48);
    okButton.setEnabled(false);
    selectedSpeakers = new java.util.ArrayList<org.lp20.aikuma.model.Speaker>();
}