public void toolExecutor() {
    switch (optionText) {
        case "calc" :
            new GradeCalculator.Initialinput().foundationMaker();
            break;
        case "txt" :
            IntroScreen.MainScreen.getCurrentStage().setScene(new Notepad.Writer().getNotepadScene());
            break;
        case "psh" :
            IntroScreen.MainScreen.getCurrentStage().setScene(new PushToPhone.PushInfoToPhone().getPushWriterScene());
            break;
    }
}