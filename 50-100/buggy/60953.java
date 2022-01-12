@java.lang.Override
public void createList(com.teamspeaghetti.www.gifster.interiorapplication.model.People people) {
    if ((people.getName()) != null) {
        name.setText(people.getName());
        com.bumptech.glide.Glide.with(getContext()).load(people.getProfile_url()).crossFade().into(profile_pic);
        if (pbar.isShown()) {
            pbar.setVisibility(View.GONE);
            holder.setVisibility(View.VISIBLE);
        }
    }
}