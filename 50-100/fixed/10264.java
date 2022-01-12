@java.lang.Override
public void onClick(android.view.View v) {
    if (!(flipped)) {
        flipped = true;
        com.yiyangzhu.yydictionary.Word word = com.yiyangzhu.yydictionary.YoudaoDictionary.get(show.getText().toString());
        if (word != null) {
            show.setText(word.toString());
            show.setGravity(Gravity.NO_GRAVITY);
        }
    }
}