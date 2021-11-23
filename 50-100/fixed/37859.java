@java.lang.Override
public void onClick(android.view.View v) {
    if ((mCurrentIndex) == ((mQuestionBank.length) - 1)) {
        myIntent = new android.content.Intent(this, com.example.kieran.geoquiz.FinishedActivity.class);
        this.startActivity(myIntent);
    }else {
        mCurrentIndex = ((mCurrentIndex) + 1) % (mQuestionBank.length);
        updateQuestion();
    }
}