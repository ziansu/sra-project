@java.lang.Override
public void unfriend(com.android.summer.csula.foodvoter.models.User user) {
    foodVoterFirebaseDb.unfriendUser(userId, user);
}