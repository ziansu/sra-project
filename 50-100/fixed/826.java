public void removeProfileData(int id) {
    if ((getSelectedProfileDataList().get(id).getRecno()) != null) {
        getRemovedProfile().add(getSelectedProfileDataList().get(id).getRecno());
    }
    getProfileDataList().remove(getSelectedProfileDataList().get(id));
    getSelectedProfileDataList().remove(id);
}