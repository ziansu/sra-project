public void onActivityResult(int requestCode, int resultCode, @android.support.annotation.Nullable
android.content.Intent data) {
    final rx.subjects.PublishSubject<com.github.droibit.rxactivitylauncher.ActivityResult> subject = mSubjects.get(requestCode);
    if (subject == null) {
        throw new java.lang.IllegalStateException();
    }
    subject.onNext(new com.github.droibit.rxactivitylauncher.ActivityResult(resultCode, data));
    subject.onCompleted();
    mSubjects.remove(requestCode);
}