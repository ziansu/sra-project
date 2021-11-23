protected boolean validateAndSubmitRequest() {
    if (!(isValid()))
        return false;
    
    mAnnouncement.setTitle(mAnnouncementTitle.getText().toString());
    mAnnouncement.setBody(mAnnouncementBody.getText().toString());
    setAnnouncement();
    Requests.Announcements.with(getActivity()).makeCreateRequest(mAnnouncement);
    return true;
}