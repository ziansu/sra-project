@java.lang.Override
public void onClick(android.view.View v) {
    btn.setVisibility(View.INVISIBLE);
    java.lang.String text = "Enter Time in MM:SS";
    editText.setText(text);
    setProgressBarProgress(root, 0);
    setStartButton(root);
}