private void setup(org.bukkit.entity.Player p, java.lang.String id, java.lang.String name, java.lang.String option, int step, org.bukkit.block.Block b) {
    setupOp = p;
    setup = id;
    setupName = name;
    setupOption = option;
    setupStep = step;
    if (b != null) {
        blockChoices.add(b);
        setupStep += 1;
    }
    if ((setupStep) <= 2)
        p.sendMessage(lang(("region_select" + (setupStep))));
    else
        setupComplete();
    
}