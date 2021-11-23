public static void updateProgress(java.lang.String stage, java.lang.String step, int out, int of) {
    me.scovel.vigler.core.gui.Gui.progress.stage.setText(stage);
    me.scovel.vigler.core.gui.Gui.progress.doing.setText(step);
    me.scovel.vigler.core.gui.Gui.progress.progress.setMinimum(1);
    me.scovel.vigler.core.gui.Gui.progress.progress.setMaximum(of);
    me.scovel.vigler.core.gui.Gui.progress.progress.setValue(out);
    me.scovel.vigler.core.gui.Gui.progress.progressText.setText((((java.lang.Integer.toString(out)) + "/") + (java.lang.Integer.toString(of))));
    me.scovel.vigler.core.gui.Gui.cof = of;
}