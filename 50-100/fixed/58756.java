@java.lang.Override
public void onClick(android.view.View v) {
    selectedTeams[position] = !(selectedTeams[position]);
    if (selectedTeams[position]) {
        com.squareup.picasso.Picasso.with(parentContext).load(logoId).fit().centerCrop().into(holder.thumbnail);
    }else {
        com.squareup.picasso.Picasso.with(parentContext).load(logoId).fit().centerCrop().transform(new jp.wasabeef.picasso.transformations.GrayscaleTransformation()).into(holder.thumbnail);
    }
}