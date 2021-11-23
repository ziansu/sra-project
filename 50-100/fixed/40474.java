public void update(com.jsvoid.solarsystem.models.CelestialObject object, int position) {
    mName.setText(object.name);
    mDetails.setText(object.getDetailsStriped());
    com.squareup.picasso.Picasso.with(mImage.getContext()).load(((baseUrl) + (object.thumbnailUrl))).placeholder(R.drawable.image_preview).into(mImage);
    setItemPosition(position);
}