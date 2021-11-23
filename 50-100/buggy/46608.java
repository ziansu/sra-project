public void bindDog(com.example.guest.seniordogsfinder.models.Dog dog) {
    mNameTextView.setText(dog.getName());
    mGenderTextView.setText(dog.getGender());
    mBreedsTextView.setText(((dog.getBreeds()) + ""));
    com.squareup.picasso.Picasso.with(mContext).load(java.lang.String.valueOf(dog.getPhotos())).resize(com.example.guest.seniordogsfinder.adapters.DogsListAdapter.MAX_WIDTH, com.example.guest.seniordogsfinder.adapters.DogsListAdapter.MAX_HEIGHT).centerCrop().into(mDogImageView);
}