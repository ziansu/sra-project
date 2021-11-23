@java.lang.Override
public void onClick(android.view.View v) {
    showPopup(("The topic is " + (eventTopic.getText())), context);
    if ((categories.getCheckedRadioButtonId()) > 0) {
        selectedCategory = ((android.widget.RadioButton) (findViewById(categories.getCheckedRadioButtonId())));
        showPopup(("The category is " + (selectedCategory.getText().toString())), context);
    }else {
        showPopup("The category is null", context);
    }
    startActivity(inviteClicked);
}