public script.Script duplicate(script.Script script) {
    save(script);
    script.Script dupe = read(script.getSaveFile());
    dupe.setName(((dupe.getName()) + "Copy"));
    dupe.changeSaveFile(getFile(dupe), false);
    save(dupe);
    return dupe;
}