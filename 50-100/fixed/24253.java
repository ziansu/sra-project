public void UpdateProfilePicture(java.lang.String imageUrl) {
    if (imageUrl != null) {
        android.widget.ImageView profilePicture = ((android.widget.ImageView) (header.findViewById(R.id.profile_image)));
        com.squareup.picasso.Picasso.with(header.getContext()).load(imageUrl).transform(new apps.sparky.dallasmountainbiking.BLL.Setup.CircleTransform()).into(profilePicture);
    }
}