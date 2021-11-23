public void onClick(android.view.View view) {
    java.lang.String letterText = letter.getText().toString();
    boolean foundButton = false;
    for (int i = 0; i < solutionLength; i++) {
        if (!foundButton) {
            android.widget.Button button = ((android.widget.Button) (findViewById(i)));
            if (button.getText().equals("")) {
                button.setText(letterText);
                letter.setVisibility(View.INVISIBLE);
                foundButton = true;
            }
        }
    }
}