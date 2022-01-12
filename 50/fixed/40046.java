@java.lang.Override
public com.example.pc.shacus.Data.Model.RecommandModel getItem(int position) {
    if (position >= (getCount()))
        return mList.get((position % (getCount())));
    else
        return mList.get(position);
    
}