@java.lang.Override
public void setAdapter(blueprint.com.sage.shared.views.Adapter adapter) {
    super.setAdapter(adapter);
    if (adapter != null)
        adapter.registerAdapterDataObserver(mObserver);
    
}