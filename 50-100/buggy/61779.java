public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
    synchronized(mRunnables) {
        for (int i = 0; i < itemCount; i++) {
            mRunnables.set((toPosition + i), mRunnables.remove(fromPosition));
        }
    }
}