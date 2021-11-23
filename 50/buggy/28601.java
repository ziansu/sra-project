public final void addResident(mytown.datasource.Resident res) {
    residents.add(res);
    mypermissions.api.command.CommandCompletion.addCompletion("residentCompletion", res.getPlayerName());
}