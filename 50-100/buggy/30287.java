protected void setItem(final com.layer.sdk.messaging.Conversation conversation, com.layer.sdk.messaging.Identity authenticatedUser) {
    getViewModel().setItem(conversation, authenticatedUser);
    getBinding().getRoot().setOnLongClickListener(new android.view.View.OnLongClickListener() {
        @java.lang.Override
        public boolean onLongClick(android.view.View v) {
            if ((mViewModel.getOnItemClickListener()) != null) {
                return mViewModel.getOnItemClickListener().onItemLongClick(conversation);
            }
            return false;
        }
    });
    mBinding.executePendingBindings();
}