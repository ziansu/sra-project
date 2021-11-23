public final void removeTown(mytown.datasource.Town town) {
    towns.remove(town);
    VisualsHandler.instance.unmarkBlocks(town);
    mypermissions.api.command.CommandCompletion.removeCompletion("townCompletionAndAll", town.getName());
    mypermissions.api.command.CommandCompletion.removeCompletion("townCompletion", town.getName());
}