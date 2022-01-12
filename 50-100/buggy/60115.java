public boolean removePhysician(long pid) {
    dbc.send_Command((("delete from physician where PID = " + pid) + ")"));
    java.util.ArrayList<Database.Physician> new_physicians = localPhysicians;
    Database.Physician old_physician = findRealPhysician(((int) (pid)), new_physicians);
    new_physicians.remove(old_physician);
    setPhysicians(new_physicians);
    return true;
}