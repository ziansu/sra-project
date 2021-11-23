@java.lang.Override
public void onDestroyView() {
    super.onDestroyView();
    android.util.Log.d("ADD FRIEND FRAGMENT", "OnDestroy");
    if ((VEL1) != null)
        pcchatapp.child("user_friend").child(pcchatapp.getAuth().getUid()).removeEventListener(VEL1);
    
    if ((VEL2) != null)
        pcchatapp.child("users").removeEventListener(VEL2);
    
}