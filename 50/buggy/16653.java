@java.lang.Override
public void onClick(android.view.View v) {
    if (!(resultString.equals("0"))) {
        resultString = df.format((-(parseDouble(resultString))));
        updateState();
    }
}