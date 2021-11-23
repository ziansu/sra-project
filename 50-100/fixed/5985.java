@java.lang.Override
public void onDestroyView() {
    super.onDestroyView();
    android.util.Log.d("FRIEND FRAGMENT", "OnDestroy");
    if (((VEL) != null) && ((pcchatapp.getAuth()) != null))
        pcchatapp.child("user_friend").child(pcchatapp.getAuth().getUid()).removeEventListener(VEL);
    
}