public void getFinalActivity() {
    for (int x = 0; x < (activityList.size()); x++) {
        if ((activityList.get(x).getActivity().equalsIgnoreCase(activitySelected)) && (activityList.get(x).getType().equalsIgnoreCase(typeSelected))) {
            selectedActivity = activityList.get(x);
            android.widget.Toast.makeText(this, selectedActivity.getActivity(), Toast.LENGTH_SHORT).show();
        }
    }
}