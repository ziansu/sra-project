@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    com.google.gson.Gson gson = new com.google.gson.GsonBuilder().create();
    capstoneproject.androidnanodegree.com.cochelper.models.Profile profile = gson.fromJson(s, capstoneproject.androidnanodegree.com.cochelper.models.Profile.class);
    name.setText(profile.getName());
    com.squareup.picasso.Picasso.with(getActivity()).load(profile.getBadge().getIconUrls().getMedium()).into(leagueBadge);
}