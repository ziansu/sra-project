public void addGoal(com.example.steams.a10bands.data.models.goals.Goal goal) {
    if ((goals.get(goal.name)) == null) {
        realm.beginTransaction();
        com.example.steams.a10bands.data.models.goals.GoalState state = realm.createObject(com.example.steams.a10bands.data.models.goals.GoalState.class);
        state.name = goal.name;
        state.value = goal.value;
        realm.commitTransaction();
        goals.put(goal.name, state.toGoal());
        goalsViewModels.add(new com.example.steams.a10bands.ui.mainActivity.viewModels.GoalsListItemViewModel(goal));
    }
}