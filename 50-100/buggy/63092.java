@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    enteredInitiative = java.lang.Integer.valueOf(etRoll.getText().toString());
    trackerInfoCard.setInitiative(java.lang.String.valueOf(((enteredInitiative) + (java.lang.Integer.valueOf(trackerInfoCard.getInitiativeMod())))));
    characterList.add(trackerInfoCard);
    characterList = sortList(characterList);
    notifyDataSetChanged();
}