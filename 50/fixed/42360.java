private java.lang.Integer getOccupantID() {
    for (java.lang.Integer i : dialogList.get(0).getOccupants()) {
        if (!(i.equals(user_id))) {
            return i;
        }
    }
    return 0;
}