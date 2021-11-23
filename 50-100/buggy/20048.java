@java.lang.Override
public void setViewContent() {
    if (!(firebaseFinished))
        setLoadingProgress("Friends", 0, 2);
    else
        if ((list) == null)
            setViewError();
        else
            if (!(list.isEmpty())) {
                adapter = new com.paulvarry.intra42.adapters.GridAdapterUsers(this, list, locations);
                gridView.setAdapter(adapter);
                adapter.notifyDataSetChanged();
                gridView.setOnItemClickListener(this);
                gridView.setOnItemLongClickListener(this);
            }else
                setViewEmpty();
            
        
    
}