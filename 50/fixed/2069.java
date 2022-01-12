private void buildView(final android.content.Context context, final android.widget.LinearLayout layout, final org.apache.avro.Schema.Field field) {
    android.view.View view = interdroid.vdb.avro.view.factory.AvroViewFactory.buildListView(context, field);
    if (view != null) {
        layout.addView(view);
    }
}