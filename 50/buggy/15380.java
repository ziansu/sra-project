public void Clear() {
    net.obry.ti5x.Tester.Calc.ClearMemories();
    net.obry.ti5x.Tester.Calc.InvState = false;
    net.obry.ti5x.Tester.Calc.CurState = net.obry.ti5x.Tester.Calc.ResultState;
    net.obry.ti5x.Tester.Calc.CurFormat = net.obry.ti5x.Tester.Calc.FORMAT_FIXED;
    net.obry.ti5x.Tester.Calc.CurNrDecimals = -1;
    net.obry.ti5x.Tester.Calc.CurAng = net.obry.ti5x.Tester.Calc.ANG_DEG;
    net.obry.ti5x.Tester.Calc.OpStackNext = 0;
    net.obry.ti5x.Tester.Calc.PreviousOp = -1;
    net.obry.ti5x.Tester.Calc.ResetEntry();
}