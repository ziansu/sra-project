@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
        mParam1 = getArguments().getString(itesm.mx.perritos.pet.PetFragment.ARG_PARAM1);
        mParam2 = getArguments().getString(itesm.mx.perritos.pet.PetFragment.ARG_PARAM2);
    }
    mFirebaseDatabase = com.google.firebase.database.FirebaseDatabase.getInstance();
    mPetsDataBaseReference = mFirebaseDatabase.getReference().child("Pets");
}