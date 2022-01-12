@java.lang.Override
public void onClick(android.view.View view) {
    agenda.set(item, eventText.getText().toString());
    item = 0;
    numView.setText(numField(((item) + 1)));
    eventView.setText(agenda.get(0).toString());
    eventText.setText(agenda.get(0).toString());
}