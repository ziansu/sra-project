@java.lang.Override
public void passData(final com.intive.toz.petslist.model.Pet pet) {
    this.pet = pet;
    com.intive.toz.petDetails.view.PetImgFragment petImgFragment = new com.intive.toz.petDetails.view.PetImgFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putSerializable("pet", pet);
    petImgFragment.setArguments(args);
    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.add(R.id.fragment_container_img, petImgFragment, "help");
    fragmentTransaction.commit();
}