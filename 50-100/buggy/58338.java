public org.json.JSONObject toJSON() throws java.lang.Exception {
    org.json.JSONObject json = new org.json.JSONObject();
    json.put("id", mId);
    json.put("teacher", mTeacher);
    json.put("exam", mExam);
    json.put("status", mPending.ordinal());
    json.put("requestText", mRequestText);
    json.put("durationToAdd", mDurationToAdd);
    return json;
}