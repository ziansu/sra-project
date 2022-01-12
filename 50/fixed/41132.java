private void Clear() {
    net.obry.ti5x.Tester.Calc.Reset(false);
    net.obry.ti5x.Tester.Calc.InvState = false;
    net.obry.ti5x.Tester.Calc.CurState = net.obry.ti5x.Tester.Calc.ResultState;
}