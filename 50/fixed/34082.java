java.lang.String getProbe(java.lang.String probe_id) {
    java.lang.String response = null;
    response = get(((url_probe) + probe_id));
    return response;
}