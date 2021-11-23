public void ResetEntry() {
    CurState = net.obry.ti5x.State.EntryState;
    CurDisplay = "0";
    ExponentEntered = false;
    SetShowing(CurDisplay);
}