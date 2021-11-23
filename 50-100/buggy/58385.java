private void onItemClicked(nesto.gankio.model.Data data) {
    android.content.Intent intent = (data.getType().equals(DataType.VIDEO.toString())) ? new android.content.Intent(context, nesto.gankio.ui.activity.video.VideoActivity.class).putExtra(Intents.TRANS_DATA, data) : new android.content.Intent(context, nesto.gankio.ui.activity.content.ContentActivity.class).putExtra(Intents.TRANS_DATA, data);
    context.startActivity(intent);
}