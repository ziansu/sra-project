@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if ((getChildFragmentManager()) == null)
        return ;
    
    if ((getChildFragmentManager().getFragments()) == null)
        return ;
    
    for (android.support.v4.app.Fragment f : getChildFragmentManager().getFragments()) {
        if (f != null)
            f.onActivityResult(requestCode, resultCode, data);
        
    }
}