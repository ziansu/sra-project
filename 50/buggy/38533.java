public final mytown.datasource.Nation newNation(java.lang.String name) {
    mytown.datasource.Nation nation = new mytown.datasource.Nation(name);
    if (mytown.datasource.NationEvent.fire(new mytown.datasource.NationEvent.NationCreateEvent(nation)))
        return null;
    
    return nation;
}