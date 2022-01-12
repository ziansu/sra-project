@java.lang.Override
public void onClick(android.view.View v) {
    radioGroup = ((android.widget.RadioGroup) (rootView.findViewById(R.id.radio_group)));
    selectedButton = ((android.widget.RadioButton) (rootView.findViewById(radioGroup.getCheckedRadioButtonId())));
    int idx = (radioGroup.indexOfChild(selectedButton)) + 1;
    com.fluffyadventure.controller.Controller.getAnimal().setImagePath(("squirrel" + idx));
    android.content.Intent intent = new android.content.Intent(getActivity(), com.fluffyadventure.view.AnimalName.class);
    startActivity(intent);
}