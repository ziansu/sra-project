public java.lang.String getClientId(java.lang.String id) {
    if (id != null) {
        return eventIdToClientId.get(id);
    }else {
        return null;
    }
}