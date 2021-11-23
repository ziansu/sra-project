@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    if (context instanceof com.usal.jorgeav.sportapp.MainActivityContract.FragmentManagement)
        mFragmentManagementListener = ((com.usal.jorgeav.sportapp.MainActivityContract.FragmentManagement) (context));
    
    if (context instanceof com.usal.jorgeav.sportapp.MainActivityContract.ActionBarIconManagement)
        mActionBarIconManagementListener = ((com.usal.jorgeav.sportapp.MainActivityContract.ActionBarIconManagement) (context));
    
}