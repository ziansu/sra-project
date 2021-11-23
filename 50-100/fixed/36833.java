protected final void invalidateList() {
    if ((listView) == null)
        return ;
    else
        if ((((mBuilder.items) == null) || ((mBuilder.items.length) == 0)) && ((mBuilder.adapter) == null))
            return ;
        
    
    listView.setAdapter(mBuilder.adapter);
    if (((listType) != null) || ((mBuilder.listCallbackCustom) != null))
        listView.setOnItemClickListener(this);
    
}