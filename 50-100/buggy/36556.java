@butterknife.OnClick(value = R.id.imageview_set_contact_edit)
public void editContact() {
    editMode = !(editMode);
    com.usoosoft.ache.adapter.ContactAdapter wrapper = ((com.usoosoft.ache.adapter.ContactAdapter) (contactListView.getAdapter()));
    wrapper.setEditMode(editMode);
    if (!(wrapper.isEmpty()))
        wrapper.notifyDataSetChanged();
    
}