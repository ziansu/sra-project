@java.lang.Override
public void onClick(android.view.View v) {
    selectedCategory = ((android.widget.RadioButton) (findViewById(categories.getCheckedRadioButtonId())));
    showPopup(("The topic is " + (eventTopic.getText())), context);
    if ((selectedCategory.getText()) != null) {
        showPopup(("The category is " + (selectedCategory.getText().toString())), context);
    }else {
        showPopup("The category is null", context);
    }
    startActivity(inviteClicked);
}