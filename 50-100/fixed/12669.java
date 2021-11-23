protected remixlab.proscene.JSONObject toJSONObject(remixlab.proscene.Frame frame) {
    remixlab.proscene.JSONObject jsonFrame = new remixlab.proscene.JSONObject();
    jsonFrame.setFloat("magnitude", frame.magnitude());
    jsonFrame.setJSONArray("position", toJSONArray(frame.position()));
    jsonFrame.setJSONArray("orientation", toJSONArray(frame.orientation()));
    return jsonFrame;
}