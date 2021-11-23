@android.annotation.TargetApi(value = Build.VERSION_CODES.LOLLIPOP)
private void init() {
    setOrdering(com.volha.yandex.school.musicartists.ui.ORDERING_TOGETHER);
    addTransition(new android.transition.ChangeBounds()).addTransition(new android.transition.ChangeTransform()).addTransition(new android.transition.ChangeImageTransform());
}