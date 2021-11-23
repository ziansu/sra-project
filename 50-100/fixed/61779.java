public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
    synchronized(mRunnables) {
        for (int i = 0; i < itemCount; i++) {
            int c = (fromPosition > toPosition) ? i : 0;
            mRunnables.set((toPosition + c), mRunnables.remove((fromPosition + c)));
        }
    }
}