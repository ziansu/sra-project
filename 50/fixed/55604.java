@java.lang.Override
public void onCompleted() {
    if (!(completed)) {
        completed = true;
        child.onCompleted();
    }
}