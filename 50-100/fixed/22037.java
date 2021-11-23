protected boolean validateAndSubmitRequest() {
    setAnnouncement();
    if (!(isValid()))
        return false;
    
    mAnnouncement.setTitle(mAnnouncementTitle.getText().toString());
    mAnnouncement.setBody(mAnnouncementBody.getText().toString());
    Requests.Announcements.with(getActivity()).makeCreateRequest(mAnnouncement);
    return true;
}