@java.lang.Override
public void onClick(android.view.View arg0) {
    OBHL.setEnermyTowerPosition(enTran);
    setEnTowerBtn.setVisibility(View.INVISIBLE);
    OKBtn.setVisibility(View.INVISIBLE);
    enProcess.startEnermyProcess();
}