@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.Integer matchesInt = java.lang.Integer.parseInt(((gamesPlayedT.getText().toString()) + ""));
    if (matchesInt == 0) {
        android.content.Intent mainpane = new android.content.Intent(this, com.akbarow.scoro.show_user_predictions.UserNoPredictionActivity.class);
        startActivity(mainpane);
    }else {
        android.content.Intent mainpane = new android.content.Intent(this, com.akbarow.scoro.show_user_predictions.UserNoPredictionActivity.class);
        startActivity(mainpane);
    }
}