@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(context, in.tosc.digitaloceanapp.activities.DetailDropletActivity.class);
    com.google.gson.Gson gson = new com.google.gson.Gson();
    intent.putExtra("DROPLET", gson.toJson(dropletList.get(position), in.tosc.doandroidlib.objects.Droplet.class));
    intent.putExtra(in.tosc.digitaloceanapp.adapters.DropletsAdapter.DROPLET_CLICKED_POSITION, position);
    context.startActivity(intent);
}