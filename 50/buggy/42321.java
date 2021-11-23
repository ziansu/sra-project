@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    io.geeteshk.hyper.helper.Firebase.removeProject(mAuth, mStorage, mObjects[newPos]);
    io.geeteshk.hyper.helper.Firebase.deleteProjectFiles(mAuth, mStorage, mObjects[newPos]);
}