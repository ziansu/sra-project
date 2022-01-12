public void run() {
    fr.umlv.unitex.MultiCommands commands;
    if (fr.umlv.unitex.Config.isAgglutinativeLanguage()) {
        commands = getRunCmdForAgglutinativeLanguages();
    }else {
        commands = getRunCmdForNonAgglutinativeLanguages();
    }
    if ((commands.numberOfCommands()) == 0)
        return ;
    
    fr.umlv.unitex.TextDicFrame.hideFrame();
    new fr.umlv.unitex.ProcessInfoFrame(commands, true, new fr.umlv.unitex.ApplyLexicalResourcesFrame.ApplyLexicalResourcesDo());
}