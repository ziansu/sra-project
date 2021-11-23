public void follow(Games.Controllers.ObserveBoardInput you) {
    if ((following) == null) {
        following = new java.util.ArrayList<>();
    }
    following.add(you);
}