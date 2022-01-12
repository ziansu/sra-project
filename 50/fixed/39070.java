@java.lang.Override
public void onTagSelected(prada.lab.android.pingo.model.Tag tag, boolean selected) {
    mRootVm.updateTagState(tag, selected);
}