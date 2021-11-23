private ItemTouchHelper.Callback createHelperCallback() {
    return new android.support.v7.widget.helper.ItemTouchHelper.SimpleCallback(((android.support.v7.widget.helper.ItemTouchHelper.UP) | (android.support.v7.widget.helper.ItemTouchHelper.DOWN)), 0) {
        @java.lang.Override
        public boolean onMove(android.support.v7.widget.RecyclerView recyclerView, android.support.v7.widget.RecyclerView.ViewHolder viewHolder, android.support.v7.widget.RecyclerView.ViewHolder target) {
            moveItem(viewHolder.getAdapterPosition(), target.getAdapterPosition());
            return true;
        }

        @java.lang.Override
        public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction) {
        }
    };
}