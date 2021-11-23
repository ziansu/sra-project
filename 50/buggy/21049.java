@java.lang.Override
public void onResult(com.teachwithapps.weconomyexperience.model.PlayerData data) {
    com.squareup.picasso.Picasso.with(itemView.getContext()).load(data.getPhotoUrl()).into(iconList.get(key));
}