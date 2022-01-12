@java.lang.Override
public void onClick(android.view.View view) {
    ((com.pedrodavidlp.footballmanager.view.activity.JoinGroupActivity) (getActivity())).startAnimationFab();
    presenter.joinGroup(new com.pedrodavidlp.footballmanager.domain.model.Group(nameGroup.getText().toString(), passGroup.getText().toString()), new com.pedrodavidlp.footballmanager.domain.model.Player(com.pedrodavidlp.footballmanager.data.UserRepository.currentNickname, 0, false, false));
}