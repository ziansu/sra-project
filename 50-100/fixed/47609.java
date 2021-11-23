@java.lang.Override
public void onClick(android.view.View v) {
    int rnd = new java.util.Random().nextInt((wordSize - 1));
    com.example.rinnv.esd_g03.Models.Word word = words.get(rnd);
    java.lang.String wordText = word.getWord();
    java.lang.String wordPhonetic = word.getPhonetic();
    wordTextTV.setText(wordText);
    wordPhoneticTV.setText(wordPhonetic);
}