@java.lang.Override
public boolean onItemClick(com.hippo.easyrecyclerview.EasyRecyclerView parent, android.view.View view, int position, long id) {
    if (position != 0) {
        android.content.ClipboardManager cmb = ((android.content.ClipboardManager) (getContext().getSystemService(Context.CLIPBOARD_SERVICE)));
        cmb.setPrimaryClip(android.content.ClipData.newPlainText(null, mValues.get(position)));
        android.widget.Toast.makeText(getContext(), R.string.copied_to_clipboard, Toast.LENGTH_SHORT).show();
        return true;
    }else {
        return false;
    }
}