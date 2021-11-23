public void removeProfileData(int id) {
    if ((getProfileDataList().get(id).getRecno()) != null) {
        getRemovedProfile().add(getSelectedProfileDataList().get(id).getRecno());
    }
    getProfileDataList().remove(getProfileDataList().get(id));
    getSelectedProfileDataList().remove(id);
}