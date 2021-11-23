public com.luorrak.ouroboros.thread.ThreadFragment newInstance(java.lang.String resto, java.lang.String boardName) {
    com.luorrak.ouroboros.thread.ThreadFragment threadFragment = new com.luorrak.ouroboros.thread.ThreadFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putString("resto", resto);
    args.putString("boardName", boardName);
    threadFragment.setArguments(args);
    return threadFragment;
}