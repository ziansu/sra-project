@java.lang.Override
public java.lang.String workoutUserInfoSelectUserId(java.lang.String userId) throws java.lang.Exception {
    java.lang.System.out.println(("workoutUserInfoSelectUserId : " + userId));
    java.lang.String userIdResult = "";
    if ((wm.retrieveWorkoutUserInfoUserId(userId)) == null) {
        userIdResult = "null";
    }else {
        userIdResult = wm.retrieveWorkoutUserInfoUserId(userId);
    }
    java.lang.System.out.println(userIdResult);
    return userIdResult;
}