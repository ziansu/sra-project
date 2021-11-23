@java.lang.Override
public io.engineblock.activityapi.ActionDispenser getActionDispenser(io.engineblock.activityapi.Activity activity) {
    return new io.engineblock.activities.csv.FileActionDispenser(((io.engineblock.activities.csv.FileActivity) (activity)));
}