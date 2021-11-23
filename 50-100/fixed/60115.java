public boolean removePhysician(long pid) {
    dbc.send_Command((("delete from physician where PID = " + pid) + ")"));
    Database.Physician old_physician = findRealPhysician(((int) (pid)), localPhysicians);
    localPhysicians.remove(old_physician);
    return true;
}