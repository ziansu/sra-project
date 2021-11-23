public void deleteBatch(android.content.Context context, int position) {
    com.github.jmuthu.poovali.model.Batch batch = batchList.get(position);
    batchList.remove(position);
}