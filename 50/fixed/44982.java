@java.lang.Override
public void onResult(java.util.List<com.example.nofarcohenzedek.dogo.Model.DogOwner> dogOwners) {
    for (com.example.nofarcohenzedek.dogo.Model.DogOwner dogOwner : dogOwners) {
        data.add(dogOwner);
        list.setAdapter(adapter);
    }
    progressBar.setVisibility(View.GONE);
}