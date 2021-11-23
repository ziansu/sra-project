public labellingMachine_2.Sticker updateTag(labellingMachine_2.Sticker t) {
    if (((t.support) == 3) && ((t.nbSteps) > (tagEndStep))) {
        t = new labellingMachine_2.Sticker(config, 1, true);
        t.nbSteps = ((minTSteps) - ((tagDelay) + (config.Tsteps))) - (round(random((-(config.ITesteps)), config.ITesteps)));
    }
    return t;
}