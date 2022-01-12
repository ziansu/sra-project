@java.lang.Override
public void onClick(android.view.View v) {
    double value = parseDouble(resultString);
    if (value != 0) {
        resultString = df.format((-value));
        updateState();
    }
}