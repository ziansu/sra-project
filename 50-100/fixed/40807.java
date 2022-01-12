@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View root = inflater.inflate(R.layout.content_chat, container, false);
    butterknife.ButterKnife.bind(this, root);
    mPresenter.init();
    mChatContentView.setOnSendListener(mPresenter);
    mChatContentView.setRefreshListener(mPresenter);
    return root;
}