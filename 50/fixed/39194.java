@java.lang.Override
public void follow(leetcode.Twitter.User follower) {
    if ((!(this.equals(follower))) && (!(this.followedList.contains(follower)))) {
        this.followedList.add(follower);
    }
}