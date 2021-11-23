public labellingMachine_2.Sticker updateLabel(labellingMachine_2.Sticker l) {
    if (((l.support) == 3) && ((l.nbSteps) > (labelEndStep))) {
        l = new labellingMachine_2.Sticker(config, 2, false, (((minLSteps) - ((labelDelay) + (config.Lsteps))) - (round(random((-(config.ILLesteps)), config.ILLesteps)))));
    }
    return l;
}