private void initPVCWindow(se.doverfelt.prog2.game21.EnumMode mode) {
    mainView = (mode == (se.doverfelt.prog2.game21.EnumMode.COMP_EASY)) ? new se.doverfelt.prog2.game21.gui.views.EasyView(this) : new se.doverfelt.prog2.game21.gui.views.HardView(this);
    this.add(mainView);
}