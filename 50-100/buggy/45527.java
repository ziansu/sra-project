private void submitLostItem(java.util.Date dateTime) {
    int reward = java.lang.Integer.parseInt(rewardField.getText().toString());
    newItem = new com.example.mcw0805.wheres_my_stuff.Model.LostItem(inputName, inputDescription, dateTime, inputLongitude, inputLatitude, inputItemCategory, uid, reward);
    newItem.writeToDatabase(com.example.mcw0805.wheres_my_stuff.Model.LostItem.getChildRef());
    incrementSubmissionCount();
}