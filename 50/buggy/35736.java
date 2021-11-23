public void submitAnswer(android.view.View view) {
    java.lang.String selectedValue = ((android.widget.Button) (view)).getText().toString();
    com.codequest.main.GameController.getGameController(this).update(selectedValue);
}