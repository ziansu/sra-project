public void updateRound(com.efd.striketectablet.DTO.WorkoutDTO workoutDTO) {
    if ((roundNums.size()) > 0)
        roundNums.clear();
    
    if (workoutDTO == null)
        workoutRoundListAdapter.notifyDataSetChanged();
    
    updateTime(workoutDTO);
    workoutRoundListAdapter.setWorkoutDTO(workoutDTO);
    roundNums.addAll(generateRoundNumArray(workoutDTO.getRoundcount()));
    workoutRoundListAdapter.notifyDataSetChanged();
}