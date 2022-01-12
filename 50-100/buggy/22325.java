public java.lang.String getNameWithDescriptors() {
    java.lang.StringBuilder nameBuilder = new java.lang.StringBuilder();
    switch (countType) {
        case TIME :
            nameBuilder.append(com.cpq.workout.logic.TimeFormatter.getTimeStringFromMillis(durationMillis)).append(" ").append(name);
        case com.cpq.workout.model.ActionEvent.MAX_REPS :
            nameBuilder.append(name).append(com.cpq.workout.model.ActionEvent.MAX_REPS);
            break;
        case com.cpq.workout.model.ActionEvent.MAX_SETS :
            nameBuilder.append(name).append(com.cpq.workout.model.ActionEvent.MAX_SETS);
            break;
        default :
            nameBuilder.append(name);
            break;
    }
    return nameBuilder.toString();
}