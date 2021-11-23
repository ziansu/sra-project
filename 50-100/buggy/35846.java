public boolean applyDependencie(org.promasi.game.company.EmployeeTask dependencieTask) {
    boolean result = false;
    if (dependencieTask != null) {
        if (_dependencies.contains(dependencieTask.getTaskName())) {
            if ((dependencieTask._lastStep) > (_firstStep)) {
                int duration = (_lastStep) - (_firstStep);
                _firstStep = dependencieTask._lastStep;
                _lastStep += duration;
            }
            result = true;
        }
    }
    return result;
}