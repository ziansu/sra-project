@java.lang.Override
public void follow(leetcode.Twitter.User follower) {
    if (follower != null) {
        this.followedList.add(follower);
    }
}