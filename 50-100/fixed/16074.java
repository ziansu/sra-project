@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String userInput = mUsernameBox.getText().toString();
    if ((userInput.length()) <= 2) {
        android.widget.Toast.makeText(this, "Please enter a username 3 characters or longer.", Toast.LENGTH_SHORT).show();
    }else {
        com.example.keelan.quizapp.App.startQuiz(false);
        App.currentUser.setUsername(userInput);
        android.content.Intent intent = new android.content.Intent(context, com.example.keelan.quizapp.StartScreen.class);
        startActivity(intent);
    }
}