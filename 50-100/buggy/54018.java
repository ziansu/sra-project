@java.lang.Override
public void onClick(android.view.View view) {
    java.util.List<com.vis.beans.Interest> interestList = dataAdapter.interestList;
    for (com.vis.beans.Interest interest : interestList) {
        if (interest.isSelected()) {
            selectedInterests.add(interest.getInterest());
        }
    }
    editor.putStringSet(Constants.PREFERENCES_SELECTED_INTERESTS, selectedInterests).commit();
    editor.putBoolean(Constants.PREFERENCES_INTEREST, true).commit();
    editor.apply();
    finish();
}