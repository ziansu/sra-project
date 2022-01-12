public void updateUI(com.handup.handup.model.Content c) {
    if ((mRecyclerViewAdapter) != null) {
        for (int i = 0; i < 20; ++i)
            mRecyclerViewAdapter.addItem(c);
        
        mRecyclerViewAdapter.notifyDataSetChanged();
    }
}