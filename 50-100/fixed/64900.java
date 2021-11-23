private android.view.View findViewById(int id) {
    if ((activity) != null)
        return activity.findViewById(id);
    
    if ((fragment) != null) {
        android.view.View view = fragment.getView();
        if (view != null)
            return view.findViewById(id);
        
    }
    return null;
}