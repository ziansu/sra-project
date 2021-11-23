public void process(net.osmand.plus.osmedit.data.Tag tag) {
    if (mFilters.containsKey(tag.tag)) {
        final android.widget.EditText editText = mFilters.get(tag.tag);
        editText.setText(tag.value);
        mFilters.remove(tag.tag);
    }
}