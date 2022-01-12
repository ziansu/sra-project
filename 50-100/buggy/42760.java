public final boolean addTown(mytown.datasource.Town town) {
    towns.put(town.getName(), town);
    CommandManager.completionMap.get("townCompletionAndAll").add(town.getName());
    CommandManager.completionMap.get("townCompletion").add(town.getName());
    MyTown.instance.log.info(("Added town " + (town.getName())));
    return true;
}