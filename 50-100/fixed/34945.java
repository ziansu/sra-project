@java.lang.Override
public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    switch (holder.getItemViewType()) {
        case com.example.viewpagerinrecyclerviewexam.RecyclerViewAdapter.TYPE_PAGER :
            com.example.viewpagerinrecyclerviewexam.RecyclerViewAdapter.PagerViewHolder holder1 = ((com.example.viewpagerinrecyclerviewexam.RecyclerViewAdapter.PagerViewHolder) (holder));
            com.example.viewpagerinrecyclerviewexam.ViewPagerAdapter adapter = new com.example.viewpagerinrecyclerviewexam.ViewPagerAdapter(mFragementManager, mFragmentList);
            holder1.viewPager.setAdapter(adapter);
            break;
        case com.example.viewpagerinrecyclerviewexam.RecyclerViewAdapter.TYPE_NORMAL :
            com.example.viewpagerinrecyclerviewexam.RecyclerViewAdapter.ItemViewHolder holder2 = ((com.example.viewpagerinrecyclerviewexam.RecyclerViewAdapter.ItemViewHolder) (holder));
            holder2.textView.setText(mStringList.get((position - 1)));
            break;
    }
}