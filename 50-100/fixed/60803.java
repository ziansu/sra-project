public void updateRound(com.efd.striketectablet.DTO.WorkoutDTO workoutDTO) {
    if ((roundNums.size()) > 0)
        roundNums.clear();
    
    updateTime(workoutDTO);
    if (workoutDTO == null) {
        workoutRoundListAdapter.notifyDataSetChanged();
        return ;
    }
    workoutRoundListAdapter.setWorkoutDTO(workoutDTO);
    roundNums.addAll(generateRoundNumArray(workoutDTO.getRoundcount()));
    workoutRoundListAdapter.notifyDataSetChanged();
}